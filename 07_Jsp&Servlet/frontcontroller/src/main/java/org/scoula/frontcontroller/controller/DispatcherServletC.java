package org.scoula.frontcontroller.controller;

import org.scoula.frontcontroller.command.Command;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

public class DispatcherServletC extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix = "/views/";
    String suffix = ".jsp";

    public void init() {
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        createMap(getMap, postMap);
    }

    protected void createMap(Map<String, Command> map, Map<String, Command> postMap) {

    }
}
