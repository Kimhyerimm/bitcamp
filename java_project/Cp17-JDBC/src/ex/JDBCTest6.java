package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest6 {

	public static void main(String[] args) {
	
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {

			// 0. ����̹� LIB �߰�
			// 1. �����ͺ��̽� ����̹� �ε�
			//	Class.forName(����̹� Ŭ���� ��ü�̸�)
			//	Oracle : oracle.jdbc.driver.OracleDriver
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			// 2. �����ͺ��̽� ����
			//String url = "jdbc:oracle:thin:@�ּ�:��Ʈ:�����ͺ��̽��̸�";
			//�ּ�: localhost or 127.0.0.1
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw ="tiger";
			
			
			// connection ��ü ����
			conn = DriverManager.getConnection(url, user, pw);
			
			
			// 3. SQL ó��
			// Statement or PreparedStatement
//			pstmt = conn.prepareStatement(SQL ����)
			
			String sql = "insert into dept ( deptno, dname, loc)"
					+ " values (?,?,?)";
			
			

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 70);
			pstmt.setString(2, "������");
			pstmt.setString(3, "����");
			
			int resultCnt = pstmt.executeUpdate();
			
			if(resultCnt>0) {
				System.out.println("���������� �Է� �ƽ��ϴ�");
				System.out.println(resultCnt+"���� �Էµƽ��ϴ�");
			} 
			else {
				System.out.println("�Է��� ���� �ʾҽ��ϴ�. Ȯ���� �� �õ����ּ���");
			}
			
			
			
		
			
			// 4. �����ͺ��̽� ���� ����
//			rs.close();
//			pstmt.close();
//			conn.close();
//			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			// 4. �����ͺ��̽� ���� ����
			if(rs !=null ) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} // rs�� 
			
			
			if(pstmt !=null) {
			try {
				pstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			} // pstmt �� 
			
			if(conn !=null) {
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			} // conn ��
			
			
		} // finally ��
		
		
		
		
		
	}

}
