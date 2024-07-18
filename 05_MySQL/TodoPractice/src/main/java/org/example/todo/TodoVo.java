package org.example.todo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class TodoVo {
    private final int id;
    private final String name;
    private final String password;
    private final boolean is_completed;
    private final Timestamp created_at;
}
