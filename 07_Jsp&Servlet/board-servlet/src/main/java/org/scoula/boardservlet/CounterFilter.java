package org.scoula.boardservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class CounterFilter implements Filter {
    private static int count = 0;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count++;
        System.out.println("Filter 가 작동한 횟수는 : " + count);

        request.setAttribute("count", count);
        response.setContentType("text/html; charset=UTF-8");

        chain.doFilter(request, response);
    }
}
