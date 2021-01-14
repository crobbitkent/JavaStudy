package org.keroro.store;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class KioskServer {

	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(5555);) {

			while (true) {

				System.out.println("Kiosk Server ready.......");

				try (Socket socket = server.accept();
					DataInputStream din = new DataInputStream(socket.getInputStream());
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						) {

					String str = din.readUTF();
					System.out.println("client : " + str);

					// 사용자가 보낸 메시지를 Json으로
					Gson gson = new Gson();

					// gson(json)을 HashMap으로
					Map<String, Object> map = gson.fromJson(str, HashMap.class);
					
					//========================= 메시지 파싱 완료
					
					// message map에서 oper 부분 받기
					String oper = (String)map.get("oper");
					
					System.out.println("OPER : " + oper);
					
					// 고객이 원하는 것(oper)에 따라 원하는 것을 다시 준다.
					String result = "";
					
					switch(oper) {
					case "O":
						result = oper();
						break;
					case "M":
						result = menu();
						break;
					default:
							break;
					}

					dos.writeUTF(result);

					System.out.println(result);

				} catch (Exception e) {
					System.out.println("클라이언트 문제 발생");
				}

			} // end while
		} catch (Exception e) {
			System.out.println("서버 문제 발생");
		}

	}
	
	// 메뉴 목록
	private static String menu() {
//		
//		Menu a = new Menu("빅맥", 6000);
//		Menu b = new Menu("쿼터치즈버거", 7500);
//		Menu c = new Menu("와퍼", 7000);
//
//		List<Menu> menuList = new ArrayList<Menu>();
//
//		menuList.add(a);
//		menuList.add(b);
//		menuList.add(c);
		return "메뉴 목록";
	}

	// 주문 내역
	private static String oper() {
//		
//		Menu a = new Menu("빅맥", 6000);
//		Menu b = new Menu("쿼터치즈버거", 7500);
//		Menu c = new Menu("와퍼", 7000);
//
//		List<Menu> menuList = new ArrayList<Menu>();
//
//		menuList.add(a);
//		menuList.add(b);
//		menuList.add(c);
		return "주문 결과";
	}
}
