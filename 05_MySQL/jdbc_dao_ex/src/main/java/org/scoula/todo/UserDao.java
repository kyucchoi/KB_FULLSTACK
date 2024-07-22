package org.scoula.todo;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDao {
    static Connection conn = null;

    static {
        static {
            try {
                // 데이터베이스 연결 정보 문자열로 작성한 버전
                // DB 접속에 필요한 Driver 클래스를 지정하는 문자열
                String driver = "com.mysql.cj.jdbc.Driver";
                // DB 에서 어떤 데이터베이스에 접속할지 정하는 문자열, 우리는 user_ex 를 선택해야 한다
                String url = "jdbc:mysql://localhost:3306/user_ex";
                // 접속 계정은 root 를 사용하므로 id 는 root 로 설정, 비번은 각자의 비번에 맞게 입력
                String id = "root";
                String password = "1234";

                Class.forName(driver);
                conn = DriverManager.getConnection(url, id, password);

                if (conn != null) {
                    System.out.println("DB 접속에 성공!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
