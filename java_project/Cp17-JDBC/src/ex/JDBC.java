package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection conn=null;
		Statement stmt =null;
		ResultSet rs = null;
		Scanner kb = new Scanner(System.in);
		
		
		String sql=null;
		int resultCnt=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pw = "tiger";
			
			
			System.out.println("1.������� \t 2.�μ����� ");
			int num = kb.nextInt();
			switch(num) {
				
			case 1:

				
				System.out.println("1. �Է� ,2. ����, 3.���� , 4.����Ʈ, 5.�˻�");
				int key = kb.nextInt();
				
				
				switch (key) {
				case 1:   // �Է�
					conn = DriverManager.getConnection(url, user, pw);
					
					kb.nextLine();
					
					System.out.println("�߰��� ������ �Է��ϼ���");
					
					System.out.println("�����ȣ");
					int insert_empno = kb.nextInt();
					System.out.println(insert_empno);
					kb.nextLine();
					
					System.out.println("����̸�");
					String insert_ename = kb.nextLine();
					kb.nextLine();
					System.out.println(insert_ename);
					
					
					
					System.out.println("����");
					String insert_job = kb.nextLine();
					
					System.out.println("�Ŵ���");
					int insert_mgr = kb.nextInt();
					
					
					kb.nextLine();
					System.out.println("�Ի���");
					String insert_hiredate = kb.nextLine();
					kb.nextLine();
					
					System.out.println("�޿�");
					int insert_sal = kb.nextInt();
					
					System.out.println("����");
					int insert_comm = kb.nextInt();
					
					System.out.println("�μ���ȣ");
					int insert_deptno = kb.nextInt();
					
					
					
					stmt = conn.createStatement();
					
					sql = "insert into emp (empno,ename,job,mgr,hiredate,sal,comm,deptno)"
	+ "values('"+insert_empno+"','"+insert_ename+"','"+insert_job+"','"+insert_mgr+"','"+insert_hiredate+"','"+insert_sal+"','"+insert_comm+"','"+insert_deptno+"')";
					
				
					
					resultCnt = stmt.executeUpdate(sql); // DML(�μ�Ʈ,����,������)
					System.out.println(resultCnt+"�� ���� �Էµƽ��ϴ�.");
					System.out.println(sql);
					
					
					stmt.close();
					conn.close();
					
					break;

					
				case 2: // ����
					
					conn = DriverManager.getConnection(url, user, pw);
					
					kb.nextLine();
					System.out.println("�����ϰ���� ������ �̸��� �Է��ϼ���");
					String search_ename = kb.nextLine();
		
			
					System.out.println("������ �̸��� �Է��ϼ���");
					String up_ename = kb.nextLine();
					System.out.println("������ �μ���ȣ�� �Է��ϼ���");
					int up_empno = kb.nextInt();
					System.out.println("������ �޿��� �Է��ϼ���");
					int up_sal = kb.nextInt();
					System.out.println("������ ������ �Է��ϼ���");
					int up_comm = kb.nextInt();
					System.out.println("������ �Ŵ�����ȣ�� �Է��ϼ���");
					int up_mgr = kb.nextInt();
					kb.hasNextLine();
					
					
					stmt = conn.createStatement();
					
					
					sql = "update emp "
							+"set ename='"+up_ename+"', empno='"+up_empno+"', sal='"+up_sal+"',comm='"+up_comm+"',mgr='"+up_mgr+"' "
							+"where ename='"+search_ename+"'";
					
					resultCnt = stmt.executeUpdate(sql); // DML(�μ�Ʈ,����,������)
					System.out.println(resultCnt+"�� ���� ������Ʈ�ƽ��ϴ�.");
					System.out.println(sql);
					
					
					stmt.close();
					conn.close();
					
					
					
					break;
					
					
				case 3: // ����
					
					conn = DriverManager.getConnection(url, user, pw);
					
					kb.nextLine();
					
					System.out.println("�����ϰ���� ������ �����ȣ�� �Է��ϼ���");
					int search_empno = kb.nextInt();
					
					stmt = conn.createStatement();
					
					sql = "delete from emp where empno='"+search_empno+"'";
					
			
					stmt.executeUpdate(sql);
					System.out.println(sql);
					
					
					stmt.close();
					conn.close();
					
					break;
					
				case 4: // ����Ʈ
					
					conn = DriverManager.getConnection(url, user, pw);
					
					System.out.println("��ü ����Ʈ�� ����մϴ�");
					
					stmt = conn.createStatement();
					
					sql ="select * from emp";
					
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery(sql);
					
					
					System.out.println("�������Ʈ");
					System.out.println("---------------------------");
					System.out.println("EMPNO \t ENAME \t JOB \t MGR \t HIREDATE \t SAL \t COMM \t DEPTNO ");
					System.out.println("---------------------------");
					
					
					while(rs.next()) {
						
			System.out.println(rs.getInt(1) +"\t" + rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getInt(8)+"\n");
			
						
					}
					
					rs.close();
					stmt.close();
					conn.close();
					
					
					break;
					
				case 5: // �˻�
					
					kb.nextLine();
					
					conn = DriverManager.getConnection(url, user, pw);
					
					
					System.out.println("�˻��ϰ��� �ϴ� ����� �̸��� �Է��ϼ���");
					search_ename = kb.nextLine();
					
					stmt = conn.createStatement();
					
					
					sql = "select * from emp where ename='"+search_ename+"'";
					
					
					stmt.executeQuery(sql);
					rs = stmt.executeQuery(sql);
					
					
					System.out.println("�������Ʈ");
					System.out.println("---------------------------");
					System.out.println("EMPNO \t ENAME \t JOB \t MGR \t HIREDATE \t SAL \t COMM \t DEPTNO ");
					System.out.println("---------------------------");
					

					while(rs.next()) {
						
			System.out.println(rs.getInt(1) +"\t" + rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7)+"\t"+rs.getInt(8)+"\n");
			
						
					}
					
					rs.close();
					stmt.close();
					conn.close();
					
					break;
					
					
					
				default:
					break;
				}
				
				
				
				
			case 2:
			
				System.out.println("1. �Է� ,2. ����, 3.���� , 4.����Ʈ, 5.�˻�");
				int key2 = kb.nextInt();
				
				
				switch (key2) {
				case 1:   // �Է�
					conn = DriverManager.getConnection(url, user, pw);
					
					kb.nextLine();
					
					System.out.println("�߰��� ������ �Է��ϼ���");
					
					System.out.println("�μ���ȣ");
					int insert_deptno = kb.nextInt();
					kb.nextLine();
					
					System.out.println("�μ��̸�");
					String insert_dname = kb.nextLine();
					kb.nextLine();
				
					
					
					
					System.out.println("����");
					String insert_loc = kb.nextLine();
					
					
					stmt = conn.createStatement();
					
					sql = "insert into dept (deptno,dname,loc)"
	+ "values('"+insert_deptno+"','"+insert_dname+"','"+insert_loc+"')";
					
				
					
					resultCnt = stmt.executeUpdate(sql); // DML(�μ�Ʈ,����,������)
					System.out.println(resultCnt+"�� ���� �Էµƽ��ϴ�.");
					System.out.println(sql);
					
					
					stmt.close();
					conn.close();
					
					break;

				
				case 2: // ����
					
					conn = DriverManager.getConnection(url, user, pw);
					
					kb.nextLine();
					System.out.println("�����ϰ���� �μ��� �̸��� �Է��ϼ���");
					String search_dname = kb.nextLine();
		
			
					System.out.println("������ �μ��� �̸��� �Է��ϼ���");
					String up_dname = kb.nextLine();
					System.out.println("������ �μ��� ��ġ�� �Է��ϼ���");
					String up_loc = kb.nextLine();
					
					
					
					stmt = conn.createStatement();
					
					
					sql = "update dept "
							+"set dname='"+up_dname+"', loc='"+up_loc+"'"
							+"where dname='"+search_dname+"'";
					
					resultCnt = stmt.executeUpdate(sql); // DML(�μ�Ʈ,����,������)
					System.out.println(resultCnt+"�� ���� ������Ʈ�ƽ��ϴ�.");
					System.out.println(sql);
					
					
					stmt.close();
					conn.close();
					
					
					
					break;
					
					
				case 3: // ����
					
					conn = DriverManager.getConnection(url, user, pw);
					
					kb.nextLine();
					
					System.out.println("�����ϰ���� �μ���ȣ�� �Է��ϼ���");
					int search_deptno = kb.nextInt();
					
					stmt = conn.createStatement();
					
					sql = "delete from dept where deptno='"+search_deptno+"'";
					
			
					stmt.executeUpdate(sql);
					System.out.println(sql);
					
					
					stmt.close();
					conn.close();
					
					break;
					
				case 4: // ����Ʈ
					
					conn = DriverManager.getConnection(url, user, pw);
					
					System.out.println("��ü ����Ʈ�� ����մϴ�");
					
					stmt = conn.createStatement();
					
					sql ="select * from dept";
					
					stmt.executeUpdate(sql);
					rs = stmt.executeQuery(sql);
					
					
					System.out.println("�μ�����Ʈ");
					System.out.println("---------------------------");
					System.out.println("DEPTNO \t DNAME \t LOC");
					System.out.println("---------------------------");
					
					
					while(rs.next()) {
						
			System.out.println(rs.getInt(1) +"\t" + rs.getString(2)+"\t"+rs.getString(3)+"\n");
			
						
					}
					
					rs.close();
					stmt.close();
					conn.close();
					
					
					break;
					
				case 5: // �˻�
					
					kb.nextLine();
					
					conn = DriverManager.getConnection(url, user, pw);
					
					
					System.out.println("�˻��ϰ��� �ϴ� ����� �̸��� �Է��ϼ���");
					search_dname = kb.nextLine();
					
					stmt = conn.createStatement();
					
					
					sql = "select * from dept where dname='"+search_dname+"'";
					
					
					stmt.executeQuery(sql);
					rs = stmt.executeQuery(sql);
					
					
					
					System.out.println("�μ�����Ʈ");
					System.out.println("---------------------------");
					System.out.println("DEPTNO \t DNAME \t LOC");
					System.out.println("---------------------------");
					
					
					while(rs.next()) {
						
			System.out.println(rs.getInt(1) +"\t" + rs.getString(2)+"\t"+rs.getString(3)+"\n");
			
						
					}
					
					rs.close();
					stmt.close();
					conn.close();
					
					break;
					
					
					
				default:
					break;
				}
				
				
				
				
			}
			

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
