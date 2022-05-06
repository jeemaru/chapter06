package echo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		
		//소캣 객체생성
		Socket Socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("=====================");
		
		//connect - Server에 입력된 아이피값 불러옮
		System.out.println("서버에 연걸을 요청합니다.");
		Socket.connect(new InetSocketAddress("39.115.234.17", 10001));
		
		System.out.println("[서버에 연결 되었습니다.]");
		
		//메세지 보내기용 스트림
		OutputStream out = Socket.getOutputStream(); //소켓이 가지고있는 주소를 달라고하는 명령어
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//메세지 받기용 스트림
		InputStream is = Socket.getInputStream();
		InputStreamReader isw = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isw);
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//키보드 입력
			String str = sc.nextLine();
			
			if(str.equals("/q")) {
				break;
			}
			
			//메세지 보내기
			bw.write(str);
			bw.newLine();
			bw.flush();
			
			//메세지 받기
			String reMsg = br.readLine();
			System.out.println("받은메세지:" + reMsg);
			
		}
		
		System.out.println("=====================");
		System.out.println("클라이언트 종료");
		
		
		sc.close();
		br.close();
		bw.close();
		Socket.close();

	}

}
