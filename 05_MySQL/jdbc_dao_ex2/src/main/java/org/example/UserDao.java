package org.example;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    public void addUser(UserVo newUser) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            // 2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "0129";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. SQL 문 생성
            String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, newUser.getEmail());
            pstmt.setString(2, newUser.getPassword());
            System.out.println("3. SQL 문 생성 OK");

            // 4. SQL 문 전송 및 실험
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("전송 성공!");
            } else {
                System.out.println("전송 실패!");
            }

            // 5. 자원 해제
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllUsers() {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            // 2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "0129";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            ArrayList<UserVo> userList = new ArrayList<UserVo>();
            String sql = "SELECT * FROM users";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int tid = rs.getInt("id");
                String email = rs.getString("email");
                String tpassword = rs.getString("password");

                UserVo user = new UserVo(tid, email, tpassword);
                userList.add(user);
            }

            userList.forEach((user) -> System.out.println(user));
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int tid, String newEmail, String newPassword) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            // 2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "0129";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "UPDATE users SET email = ?, password = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, newEmail);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, tid);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("수정 성공!");
            } else {
                System.out.println("수정 실패!");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int tid) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            // 2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "0129";
            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, tid);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("삭제 성공!");
            } else {
                System.out.println("삭제 실패!@~!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
