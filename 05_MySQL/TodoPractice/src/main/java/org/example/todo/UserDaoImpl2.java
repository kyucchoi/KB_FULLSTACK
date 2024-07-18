package org.example.todo;

import org.example.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl2 implements UserDao {
    private final Connection conn;

    public UserDaoImpl2() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public UserVo loginUser(String user_id, String password) {
        String sql = "SELECT * FROM todo_user WHERE user_id = ? AND password = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user_id);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                UserVo userVo = new UserVo(
                        rs.getString("user_id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getTimestamp("created_at"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
