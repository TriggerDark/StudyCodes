package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Useinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student_data?user=root&&password=lrw5841314921");
			//String sql = "select *from stu_grade";
			String sql = "select *from stu_info";
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			String sql1 = "insert into stu_info(stu_id,name,sex) values('202','陈帅','男')";
			int num1 = stat.executeUpdate(sql1);
			/*while(rs.next()){
				//rs.getString("stu_id");
				System.out.print(rs.getString("stu_id"));
				//rs.getString("course_id");
				System.out.print("\t\t"+rs.getString("course_id"));
				//rs.getInt("grade");
				System.out.print("\t\t"+rs.getString("grade"));
				System.out.println();
			}*/
			
			/*String sql1 = "insert into stu_grade values('2007070104','804',97)";
			int num1 = stat.executeUpdate(sql1);*/
			/*String sql2 = "update stu_grade set grade = 96 where stu_id = '2007070104' and course_id = '804' ";
			int num2 = stat.executeUpdate(sql2);*/
			/*String sql3  = "delete from stu_grade where stu_id = '2007070104' and course_id = '804' ";
			int num3 = stat.executeUpdate(sql3);*/
			
			//PreparedStatement
			String sql4 = "select *from stu_info where sex = ? and mark >?";
			PreparedStatement pstat = con.prepareStatement(sql4);
			pstat.setString(1, "男");
			pstat.setInt(2, 500);
			//pstat.setString(1, "女");
			pstat.executeQuery();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
