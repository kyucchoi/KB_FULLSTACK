package org.scoula.ex04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response_redirect")
public class ResponseRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getSession().getAttribute("username");
        String useraddress = (String) request.getSession().getAttribute("useraddress");

        // 속성 설정
        request.setAttribute("username", "홍길동");
        request.setAttribute("useraddress", "서울");

        // forward
        RequestDispatcher dis = request.getRequestDispatcher("/redirect_response.jsp");
        dis.forward(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        doGet(request, response);
//    }
}
