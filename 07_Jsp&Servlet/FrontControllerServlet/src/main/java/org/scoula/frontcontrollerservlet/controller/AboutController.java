package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "컨트롤러가 전달한 메시지 입니다");
        request.setAttribute("imgSrc", "https://cdn.imweb.me/upload/S20210807d1f68b7a970c2/7170113c6a983.jpg");
        return "about";
    }
}
