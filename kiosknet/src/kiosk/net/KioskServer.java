package kiosk.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.reflect.Type;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.order.Order;
import kiosk.order.OrderItem;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class KioskServer {
	private static MenuService service;
	
	
	
	public static void main(String[] args) {
		setService();
		
		try (ServerSocket server = new ServerSocket(5555);) {

			while (true) {

				System.out.println("Kiosk Server ready.......");

				try (Socket socket = server.accept();
					DataInputStream din = new DataInputStream(socket.getInputStream());
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						) {

					String str = din.readUTF();
					System.out.println("client : " + str);

					Gson gson = new Gson();

					JsonObject jsonObj = JsonParser.parseString(str).getAsJsonObject();
					
					
					// message map���� oper �� �Ľ�
					String oper = jsonObj.get("oper").getAsString();
					
					System.out.println("OPER : " + oper);
										
					String result = "";
					
					switch(oper) {
					case "O":
						result = order(jsonObj);
						break;
					case "M":
						result = menu();
						break;
					default:
							break;
					}
					System.out.println(result);
					dos.writeUTF(result);

				} catch (Exception e) {
					System.out.println("Ŭ���̾�Ʈ ���� �߻�");
				}

			} // end while
		} catch (Exception e) {
			System.out.println("���� ���� �߻�");
		}
	}
	

	private static String menu() {
		ArrayList<Menu> menuList = service.getAllMenus();
		
		Gson gson = new Gson();
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("list", menuList);
		map.put("oper", "M");
		
		return gson.toJson(map);
	}

	private static String order(JsonObject jsonObj) {
		JsonArray jsonArray = jsonObj.get("order").getAsJsonArray();
		
		Type listType = new TypeToken<List<OrderItem>>() {}.getType();

		List<OrderItem> orderItems = new Gson().fromJson(jsonArray, listType);
		
		// order ����
		Order order = new Order((ArrayList<OrderItem>)orderItems);
		
		Map<String, Object> map = new HashMap<>();
		map.put("order", order);	
		map.put("oper", "O");	
		
		Gson gson = new Gson();
		
		return gson.toJson(map);
	}
	
	private static void setService() {
		ArrayList<Menu> arr = new ArrayList<Menu>();
		arr.add(new Menu("����",5900));
		arr.add(new Menu("�Ұ�����",4900));
		arr.add(new Menu("ġ����Ʈ��",7900));
		arr.add(new Menu("����",1800));
		arr.add(new Menu("�ݶ�",1800));
		
		service = new MenuService(arr);
	}
}
