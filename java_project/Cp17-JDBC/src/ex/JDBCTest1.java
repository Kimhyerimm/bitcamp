package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		
		
		//1. DB ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Oracle ����̹� �ε� ��... ");
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		
		// �����ͺ��̽��� ����
	
			conn = DriverManager.getConnection(url, user, pw);
	
		System.out.println("�����ͺ��̽� ���Ӽ���");
		
		//Ʈ������ ����
		conn.setAutoCommit(false);
		
		
		
		//3. sql �� ������ ó���κ�
		
		
		
		
		
		// commit : ó���Ϸ�
		conn.commit();
		
		
		//4. close
		
		conn.close();
		
		
		
		
	}

}
