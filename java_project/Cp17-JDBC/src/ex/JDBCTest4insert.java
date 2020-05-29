package ex;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest4insert {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		
		
		//1. DB ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Oracle ����̹� �ε� ��... ");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// �����ͺ��̽��� ����
		
			conn = DriverManager.getConnection(url, user, pw);
		
			System.out.println("�����ͺ��̽� ���Ӽ���");
			
			
			
			
			//3. sql �� ������ ó���κ�
			
			
			// Statement : connection
			
			stmt = conn.createStatement();
			
			String sql = "insert into dept ( deptno, dname, loc)"
					+ " values (90,'son','UK')";
			
			
			int resultCnt = stmt.executeUpdate(sql); // DML(�μ�Ʈ,����,������)
			System.out.println(resultCnt+"�� ���� �Էµƽ��ϴ�.");
			
			
			
			
		
						
			
			//4. close
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
