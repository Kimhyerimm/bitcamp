package ex;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.imageio.stream.ImageInputStream;

public class TcpIpClient {

	public static void main(String[] args) {
		
		
		try {
			Socket socket = new Socket("127.0.0.1", 7777);
			
			InputStream in = socket.getInputStream();
				DataInputStream din = new DataInputStream(in);
			
			
			System.out.println("서버 : " + din.readUTF());
			
			
			System.out.println("연결을 종료합 니다");
			
			in.close();
			din.close();
			
			
			
			
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
