package onetoone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneClient {


    public static void main(String[] args) {

        // 서버는 서버 소켓을 먼저
        // 클라는 소켓 하나 생성
        try(Scanner keyScanner = new Scanner(System.in);
            Socket socket = new Socket("127.0.0.1", 5555);
            DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        ){

            System.out.println("A client connected : " + socket);

            // 이름 설정
            // 스캐너로 받기
            // 한번 보내기
            System.out.println("닉네임을 입력하세요!");
            String name = keyScanner.nextLine();
            dos.writeUTF("R=" + name);

            // THREAD
            // 문제는 unreachable code, 그래서 잠시 for로 쓰자
            new Thread(()-> {
                try {
                    // 읽기용
                    for( int i = 0; i < 100; ++i) {
                        String message = din.readUTF();
                        System.out.println(message);
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                }
            }).start();

            // 쓰기용
            for( int i = 0; i < 100; ++i) {
                System.out.println("전체 채팅 (A), 귓속말 (W), 닉네임 수정(R)");
                String message = keyScanner.nextLine();

                if(message.equals("W")){
                    // 귓속말
                    System.out.println("누구에게 귓속말 하시겠습니까?");
                    message += "=" + keyScanner.nextLine();
                    System.out.println("내용을 입력하세요.");
                    message += "=" + keyScanner.nextLine();
                } else if(message.equals("R")){
                    // 수정
                    System.out.println("닉네임을 뭐라고 바꾸시겠습니까?");
                    message += "=" + keyScanner.nextLine();
                } else if(message.equals("A")){
                    // 전체
                    System.out.println("내용을 입력하세요.");
                    message += "=" + keyScanner.nextLine();
                } else{
                	System.out.println("잘못된 명령어입니다.");
                    continue;
                }

                dos.writeUTF(message);
                dos.flush();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
