package ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("news.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("손흥민 해병대 입대");
		bw.newLine();
		bw.write("피곤해 죽겠다");
		bw.newLine();
		bw.write("배고프다");
		
		bw.close();
		
		System.out.println("기사 작성완료");
	}

}
