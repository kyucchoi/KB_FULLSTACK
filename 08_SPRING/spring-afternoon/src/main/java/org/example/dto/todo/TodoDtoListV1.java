package org.example.dto.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDtoListV1 {
    private static TodoDtoListV1 instance;
    private List<TodoDto> todoDtoList;

    private TodoDtoListV1() {
        this.todoDtoList = new ArrayList<TodoDto>();

        // 테스트 데이터 추가
        this.addList("스프링 정복하기");
        this.addList("코테 정복하기");
    }

    // 싱글톤 인스턴스 변환 메소드
    public static synchronized TodoDtoListV1 getInstance() {
        if (instance == null) {
            instance = new TodoDtoListV1();
        }

        return instance;
    }

    public void addList(String todo) {
        todoDtoList.add(new TodoDto(todo));
    }

    public List<TodoDto> getTodoDtoList() {
        return todoDtoList;
    }
}
