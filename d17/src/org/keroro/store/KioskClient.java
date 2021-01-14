package org.keroro.store;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

public class KioskClient {

	public static void main(String[] args) {

		System.out.println("클라이언트 시작");

		Menu[] menus = null;
		ArrayList<OrderItem> items = null;
		while (true) {
			try (Socket socket = new Socket("127.0.0.1", 5555);
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					DataInputStream din = new DataInputStream(socket.getInputStream());
					Scanner keyScanner = new Scanner(System.in);) {

				Map<String, Object> msgMap = new HashMap<>();

				Gson gson = new Gson();

				System.out.println("무엇을 도와드릴까요? (M = 메뉴보기, O = 주문하기)");
				String oper = keyScanner.nextLine();

				msgMap.put("oper", oper);

				//
				if (oper.equals("O")) {
					
					items = new ArrayList<>();
					
					while (true) {
						System.out.println("메뉴번호를 입력하세요.(주문을 그만하려면 -1)");
						int menuNum = Integer.parseInt(keyScanner.nextLine());

						System.out.println("수량을 입력하세요.");
						int qty = Integer.parseInt(keyScanner.nextLine());

						if(-1 == menuNum) {
							msgMap.put("order", items);
							break;
						}
						
						OrderItem item = new OrderItem(menus[menuNum], qty);
						items.add(item);
					}
				}

				String msg = gson.toJson(msgMap);
				// --------------------------------------

//			Order order = new Order();
//			
//			OrderItem item1 = new OrderItem(new Menu("AAA", 1000), 3);
//			OrderItem item2 = new OrderItem(new Menu("BBB", 2000), 6);
//			
//			ArrayList<OrderItem> itemList = new ArrayList<>();
//			itemList.add(item1);
//			itemList.add(item2);
//			
//			order.setItems(itemList);
//			
//			msgMap.put("order", order);
//			
//			Gson gson1 = new Gson();
//			String message = gson1.toJson(msgMap); 
//			
//			System.out.println(order);

				// --------------------------------------

				// 서버에 파일을 주고
				dos.writeUTF(msg);

				System.out.println("==========================================");
				// 서버의 파일을 읽는다.
				String serverMessage = din.readUTF();
				System.out.println("server message : " + serverMessage);
				System.out.println("==========================================");

			} catch (Exception e) {
				System.out.println("문제 발생");
			} finally {

			}

			System.out.println("클라이언트 종료");
		}

	}

}
