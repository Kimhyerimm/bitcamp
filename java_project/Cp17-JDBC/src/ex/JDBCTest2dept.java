package ex;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2dept {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = null;
		ResultSet rs = null;
		
		
		
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
			Statement stmt = conn.createStatement();
			
			String sql = "select * from dept order by deptno";
			
			
			// Select �� ����� ResultSet �� �޴´�.
			// excuteQuery(sql��) -> ResultSet
			rs = stmt.executeQuery(sql);
			
			
			//ResultSet : next() -> ���� ���� ���� Ȯ�� 
			
			while(rs.next()) {
//				System.out.print(rs.getInt("deptno")+ "\t");
//				System.out.print(rs.getString("dname")+"\t");
//				System.out.print(rs.getString("loc")+"\n");	
				System.out.print(rs.getInt(1)+ "\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\n");	
			}
			
			rs.close();
			stmt.close();
						
			
			//4. close
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
