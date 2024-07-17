package org.scoula.todo.dao;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.todo.common.JDBCUtil;
import org.scoula.todo.domain.TodoVO;

import java.sql.SQLException;

class TodoDaoTest {
    TodoDao dao = new TodoDaoImpl();

    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("테스트 데이터를 생성한다.")
    public void testData() throws SQLException {
        for (int i = 0; i <= 163; i++) {
            TodoVO todo = TodoVO.builder().title("테스트 Todo " + i).description("테스트 Todo 설명" + i).userId("guest").done(false).build();
            dao.create(todo);
        }
        ;
    }
}