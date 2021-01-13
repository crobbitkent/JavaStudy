package d16;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		// 키보드 스캐너
		Scanner keyScanner = null;

		ArrayList<IpData> ipList = new ArrayList<IpData>();
		ipList.add(new IpData("geon", "192.168.0.101"));
		ipList.add(new IpData("ko", "192.168.0.91"));
		ipList.add(new IpData("dongho", "192.168.0.8"));
		ipList.add(new IpData("nam", "192.168.0.8"));
		ipList.add(new IpData("donghwan", "192.168.0.247"));
		ipList.add(new IpData("i", "192.168.0.108"));

//		Map<String, String> ipMap = new HashMap<String, String>();
//		ipMap.put("geon", "192.168.0.108");
//		ipMap.put("고현준", "192.168.0.91");
//		ipMap.put("dongho", "192.168.0.9");
//		ipMap.put("남웅지", "192.168.0.8");
//		ipMap.put("동환", "125.141.32.5");

		keyScanner = new Scanner(System.in);
		System.out.println("어디로 메시지를 보내시겠습니까?");

		String name = keyScanner.nextLine();
		System.out.println("보내고 싶은 메시지를 입력하세요.");
		String cmd = keyScanner.nextLine();

		IpData temp = null;

		for (IpData data : ipList) {
			if (name.equals(data.name)) {
				temp = data;
			}
		}

		if (null == temp) {
			System.out.println("이름을 찾을 수 없습니다.");
			return;
		}

		System.out.println(temp.ip);
		System.out.println(temp.port);
		
		try (Socket socket = new Socket(temp.ip, Integer.parseInt(temp.port));
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				Scanner inScanner = new Scanner(in)) {
			// 보내는게 우선
			out.write((cmd + "\n").getBytes());
			out.flush();

			// 받는 건 나중

			String serverMessage = inScanner.nextLine();
			System.out.println("=============================");
			System.out.println(serverMessage);
			System.out.println("=============================");

		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
