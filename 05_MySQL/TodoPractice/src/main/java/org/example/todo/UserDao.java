package org.example.todo;

public interface UserDao {
    UserVo loginUser(String userId, String password);
}
