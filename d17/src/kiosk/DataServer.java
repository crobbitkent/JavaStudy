package kiosk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.keroro.store.Menu;

import com.google.gson.Gson;

public class DataServer {

	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(5555);) {
			
			while (true) {
				
				System.out.println("Server ready.......");
				
				try (Socket socket = server.accept();
					DataInputStream din = new DataInputStream(socket.getInputStream());
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					 ) {

					String str = din.readUTF();

					Menu a = new Menu("빅맥", 6000);
					Menu b = new Menu("쿼터치즈버거", 7500);
					Menu c = new Menu("와퍼", 7000);
					
					
					List<Menu> menuList = new ArrayList<Menu>();
					
					menuList.add(a);
					menuList.add(b);
					menuList.add(c);
					
					Gson gson = new Gson();
					
					// gson(json)을 string으로
					String jsonStr = gson.toJson(menuList);
					
					dos.writeUTF(jsonStr);
					
					System.out.println(jsonStr);
					
				} catch (Exception e) {
					System.out.println("클라이언트 문제 발생");
				} 

			}// end while
		}
		catch(Exception e) {
			System.out.println("서버 문제 발생");
		}

	}

}
