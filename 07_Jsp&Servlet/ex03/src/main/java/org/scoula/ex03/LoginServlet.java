package org.scoula.ex03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 요청에서 파라미터 얻기
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");

        // 응답 보내기
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("아이디 값 : " + userid + "<br>");
        out.print("비밀번호 값 : " + password + "<br>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
