package org.example.controller.todo.v2;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class TodoShowControllerV2 {
    private final TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoShowControllerV2(final TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    @GetMapping("/todo/v2/show")
    public String process(Model model) {
        log.info("===============> TODO 조회 페이지 호출, /todo/v2/show");

        model.addAttribute("todoList", todoDtoList.getTodoDtoList());
        return "todo-show2";
    }
}
