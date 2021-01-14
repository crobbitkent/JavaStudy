package kiosk.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.order.Order;
import kiosk.order.OrderItem;
import kiosk.order.OrderUI;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KioskClient {
	private MenuUI menuUi;
	private OrderUI orderUi;
	private Scanner keyScanner;

	public void start() {

		System.out.println("클라이언트 시작");

		ArrayList<OrderItem> items = null;
		ArrayList<Menu> menus = null;
		Scanner keyScanner = new Scanner(System.in);

		while (true) {

			try (Socket socket = new Socket("127.0.0.1", 5555);
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					DataInputStream din = new DataInputStream(socket.getInputStream());) {

				Map<String, Object> msgMap = new HashMap<>();

				Gson gson = new Gson();

				System.out.println("무엇을 도와드릴까요? (M = 메뉴 보기, O = 주문 하기)");
				String oper = keyScanner.nextLine();

				msgMap.put("oper", oper);

				// 주문하기
				if (oper.equals("O")) {
					items = orderUi.makeOrder().getItems();
					// 주문 보내기
					msgMap.put("order", items);
				} if(oper.equals("n")) {
					// 시스템 종료
					break;
				}

				// msgMap에 2개를 보낸다.
				String msg = gson.toJson(msgMap);

				// ========================= 보내기 =========================== //
				dos.writeUTF(msg);

				System.out.println("==========================================");

				// ======================== 받기 ============================== //
				String serverMessage = din.readUTF();

				// ======================== 파싱 ============================== //
				Map<String, Object> map = gson.fromJson(serverMessage, HashMap.class);
				JsonObject jsonObj = JsonParser.parseString(serverMessage).getAsJsonObject();
				String oper2 = jsonObj.get("oper").getAsString();

				// ======================== 분기점 ========================== //
				if (oper.equals("M")) {
					setMenuUI(jsonObj, menus);
				} else if (oper.equals("O")) {
					printOrder(serverMessage);
				}

				System.out.println("==========================================");

			} catch (Exception e) {
				System.out.println("클라이언트 문제 발생");
			}
		}
		
		System.out.println("클라이언트 종료");
	}

	private void setMenuUI(JsonObject jsonObj, ArrayList<Menu> arr) {

		try {
			JsonArray jsonArray = jsonObj.get("list").getAsJsonArray();

			Type listType = new TypeToken<List<Menu>>() {
			}.getType();

			List<Menu> menuList = new Gson().fromJson(jsonArray, listType);

			arr = (ArrayList<Menu>) menuList;
			MenuService service = new MenuService(arr);
			menuUi.setService(service);
			orderUi.setService(service);
			// ui 출력
			menuUi.showAllMenus();

		} catch (Exception e) {
			System.out.println("setMenuUI 문제 발생");
			e.printStackTrace();
		}

	}

	// 주문 내역 파싱, 출력
	private void printOrder(String str) {
		try {
		Gson gson = new Gson();
		Map<String, Object> map = gson.fromJson(str, HashMap.class);
		JsonObject jsonObj = JsonParser.parseString(str).getAsJsonObject();
		JsonElement ele = jsonObj.get("order").deepCopy();
		Order order = gson.fromJson(ele, Order.class);
		
		// 주문내역 출력하기
		orderUi.printOrder(order);
		} catch(Exception e) {
			System.out.println("printOrder 문제 발생");
			e.printStackTrace();
		}

	}

}
