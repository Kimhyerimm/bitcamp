package ex;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3emp {

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
			
			
			Scanner kb = new Scanner(System.in);
			
			System.out.println("ȸ���� �̸��� �Է��ϼ���.");
			String searchName = kb.nextLine();
			
			
			
			String sql = "select * from emp";
			String sql1 =  "select o.orderid, c.name,b.bookname from customer c, book b, orders o "
					+ " where c.custid=o.custid and b.bookid=o.bookid"
					+ " and c.name='"+searchName+"'";
			
			
			System.out.println("sql :" + sql1);
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			
			
			// Select �� ����� ResultSet �� �޴´�.
			// excuteQuery(sql��) -> ResultSet
//			rs = stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql1);
			
			
			//ResultSet : next() -> ���� ���� ���� Ȯ�� 
			
//			System.out.println("�������Ʈ");
//			System.out.println("----------------------");
//			System.out.println("�����ȣ\t����̸�\t����");
//			System.out.println("----------------------");
			
			System.out.println("�ǸŸ���Ʈ");
			System.out.println("---------------------------");
			System.out.println("�Ǹ� ���̵� \t ȸ���̸� \t å�̸�");
			System.out.println("---------------------------");
			
			
			while(rs.next()) {
//				System.out.print(rs.getInt("empno")+ "\t");
//				System.out.print(rs.getString("ename")+"\t");
//				System.out.print(rs.getString("sal")+"\n");	
				System.out.print(rs.getInt(1)+ "\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\n");	
//				System.out.print(rs.getString(4)+"\t");
//				System.out.print(rs.getString(5)+"\n");	
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
