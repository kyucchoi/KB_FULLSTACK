package org.scoula.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/setCookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 쿠키 생성
        Cookie userCookies = new Cookie("username", "tetz");
        userCookies.setMaxAge(7);
        response.addCookie(userCookies);

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("<h1>쿠키가 생성 되었습니다</h1>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
