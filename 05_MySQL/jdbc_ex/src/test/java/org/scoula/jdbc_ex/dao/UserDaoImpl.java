package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    Connection conn = JDBUtil.getConnection();

    // USERS 테이블 관련 SQL 명령어
    private String USER_LIST = "select * from users";
    private String USER_GET = "select * from users where id = ?";
    private String USER_INSERT = "insert into users values(?,?, ?, ?)";
    private String USER_UPDATE = "update users set name = ?, role = ?, where id = ?";
    private String USER_DELETE = "delete from users where id = ?";

    // 회원 등록
    @Override
    public int create(UserVO user) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(USER_INSERT)) {
            stmt.setString(1, user.getId());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getName());
            stmt.setString(4, user.getRole());
        }
    }

    private UserVO map(ResultSet rs) throws SQLException {
        UserVO user = new UserVO();
        user.setId(rs.getString("ID"));
        user.setPassword(rs.getString("PASSWORD"));
        user.setName(rs.getString("NAME"));
        user.setRole(rs.getString("ROLE"));
    }

    // 회원 목록 조회
    @Override
    public List<UserVO> getList() throws SQLException {
        List<UserVO> userList = new ArrayList<>();
        Connection conn = JDBUtil.getConnection();
        try (PreparedStatement stmt = conn.prepareStatement(USER_LIST);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                UserVO user = map(rs);
                userList.add(user);
            }
        }

        return userList;
    }

    // 회원 정보 조회
    @Override
    public Optional<UserVO> get(String id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(USER_GET)) {
            stmt.setString(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(map(rs));
                }
            }
        }

        return Optional.empty();
    }

    @Override
    public int update(UserVO user) throws SQLException {
        Connection conn = JDBUtil.getConnection();
        try (PreparedStatement stmt = conn.prepareStatement(USER_UPDATE)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getId());
            return stmt.executeUpdate();
        }
    }

    // USERS 테이블 관련 CRUD 메소드
    // 회원 삭제
    @Override
    public int delete(String id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(USER_DELETE)) {
            stmt.setString(1, id);
            return stmt.executeUpdate();
        }
    }
}