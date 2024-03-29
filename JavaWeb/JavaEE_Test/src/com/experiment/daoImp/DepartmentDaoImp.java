package com.experiment.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.experiment.dao.DepartmentDao;
import com.experiment.servlet.DepartmentInfo;

public class DepartmentDaoImp implements DepartmentDao {

    @Override
    public ArrayList<DepartmentInfo> getDepartmentInfo(String info) {
    	ArrayList<DepartmentInfo> da = new ArrayList<DepartmentInfo>();
        DepartmentInfo d = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/department_employee?user=root&&password=5841314921lrw");
            Statement stat = con.createStatement();
            String sql = "select * from d" + info;
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()) {
                d = new DepartmentInfo();
                d.setId(rs.getString("id"));
                d.setDepartment(rs.getString("department"));
                da.add(d);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return da;
    }
    public static void main (String[] args) {
    	DepartmentDaoImp dd = new DepartmentDaoImp();
    	System.out.println(dd.getDepartmentInfo("1101"));
    }
}
