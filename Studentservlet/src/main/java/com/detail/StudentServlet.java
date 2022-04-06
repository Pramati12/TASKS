package com.detail;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    public class StudentServlet extends HttpServlet {


        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            PrintWriter pw = resp.getWriter();
            Data d= new Data();
            pw.print(d.getstudentData());
            pw.close();


        }
}
