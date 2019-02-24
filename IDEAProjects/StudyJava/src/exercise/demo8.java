package exercise;

import java.sql.*;

public class demo8 {
    public static void main(String[] args) {
        Connection conn = null;
        String sql;
        String url = "jdbc:mysql://localhost:3306/" +
                "data?user=root&password=5841314921lrw&" +
                "useUnicode=true&characterEncoding=UTF8&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            sql = "select * from jscity";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
