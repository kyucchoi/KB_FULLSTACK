package org.example.controller.todo.v2;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoSaveControllerV2 {
    private TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoSaveControllerV2(TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    @RequestMapping(value = "/todo/v2/form/save", method = RequestMethod.GET)
    public String process(HttpServletRequest request, Model model) {
        log.info("===============> TODO 추가 Request 호출, /todo/v2/form/save");

        String todo = request.getParameter("todo");

        todoDtoList.addList(todo);

        model.addAttribute("todoList", todoDtoList.getTodoDtoList());
        return "todo-show2";
    }
}
