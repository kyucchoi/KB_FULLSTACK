package org.example.controller.todo.v1;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class TodoShowControllerV1 {
    private TodoDtoListV1 todoList = TodoDtoListV1.getInstance();

    @GetMapping("/todo/show")
    public String process(HttpServletRequest request, HttpServletResponse response) {
        log.info("===============> TODO 조회 페이지 호출, /todo/show");

        request.setAttribute("todoList", todoList.getTodoDtoList());
        return "todo-show";
    }
}
