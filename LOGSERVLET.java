package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       String uname = request.getParameter("nm");
       String upwd = request.getParameter("pwd");
       if (uname.equals("abc") && upwd.equals("121")){
           response.sendRedirect("success.html");
       }
       else {
         response.sendRedirect("fail.html");
       }
       
    

    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
@Override
    public String getServletInfo() {
        return "Short description";
    }
