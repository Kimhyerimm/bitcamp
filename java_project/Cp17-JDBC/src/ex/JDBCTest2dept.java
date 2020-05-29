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
		
		
		
		//1. DB 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Oracle 드라이버 로드 중... ");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			// 데이터베이스에 접속
		
				conn = DriverManager.getConnection(url, user, pw);
		
			System.out.println("데이터베이스 접속성공");
			
			
			
			
			
			//3. sql 로 데이터 처리부분
			
			// Statement : connection
			Statement stmt = conn.createStatement();
			
			String sql = "select * from dept order by deptno";
			
			
			// Select 의 결과는 ResultSet 이 받는다.
			// excuteQuery(sql문) -> ResultSet
			rs = stmt.executeQuery(sql);
			
			
			//ResultSet : next() -> 행의 존재 유무 확인 
			
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
