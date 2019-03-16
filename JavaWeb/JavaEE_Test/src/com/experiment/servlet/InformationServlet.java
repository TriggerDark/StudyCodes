package com.experiment.servlet;

import com.experiment.dataService.DepartmentDataService;
import com.experiment.dataServiceImp.DepartmentDataServiceImp;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/DepartmentEmployee")
public class InformationServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String info = req.getParameter("info");
        
        DepartmentDataService dpdService = new DepartmentDataServiceImp();
        ArrayList<DepartmentInfo> dpi = dpdService.getDepartmentInfoService(info);
        resp.getWriter().write((new Gson()).toJson(dpi));
    }
}
