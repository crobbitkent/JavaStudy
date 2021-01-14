import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class ChattingClient {
	public static void main(String[] args) throws Exception {
		// 키보드 스캐너
		Scanner keyScanner = null;

		// 각자 서버 포트(8080)
		ArrayList<IpData> ipList = new ArrayList<IpData>();
		ipList.add(new IpData("i", "192.168.0.108"));
		ipList.add(new IpData("geon", "192.168.0.101"));
		ipList.add(new IpData("dongho", "192.168.0.9"));

		keyScanner = new Scanner(System.in);

		System.out.println("보내고 싶은 메시지를 입력하세요.");
		String cmd = keyScanner.nextLine();
		cmd = "Mingyu : " + cmd;

		// 소켓 만들기
		ArrayList<Socket> socketList = new ArrayList<Socket>();
		
		int length = ipList.size();
			
		Scanner scanner = null;
		InputStream in;
		
		try {
			
			for(int i = 0; i < length; ++i) {
				IpData tempData = ipList.get(i);
				String ip = tempData.ip;
				int port = Integer.parseInt(tempData.port);
				Socket tempSocket = new Socket(ip, port);
				socketList.add(tempSocket);
			}
			
			// 보내는게 우선					
			for(int i = 0; i < socketList.size(); ++i){
				Socket temp = socketList.get(i);
				OutputStream out1 = temp.getOutputStream();
				out1.write((cmd + "\n").getBytes());
			}
			
			InputStream in1 = socketList.get(0).getInputStream();	
			
			// 받는 건 나중
			scanner = new Scanner(in1);

			System.out.println("=============================");
			System.out.println(scanner.nextLine());
			System.out.println("=============================");
			
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			for(int i = 0; i < socketList.size(); ++i){
				Socket temp = socketList.get(i);
				OutputStream out = temp.getOutputStream();
				
				if(null != temp) { try{temp.close();} catch(Exception e) {} }
				if(null != out) { try{out.close();} catch(Exception e) {} }
			}
			
			if(null != scanner) { try{scanner.close();} catch(Exception e) {} }
		}
		

	}

}
