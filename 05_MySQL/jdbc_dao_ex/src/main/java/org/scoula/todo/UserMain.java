package org.scoula.todo;

public class UserMain {
    public static void main(String[] args) {
//        UserDao userDao = new UserDao();

//        UserVo tetz = new UserVo(1, "tetz", "1234");
//
//        System.out.println(tetz);

        UserDao userDao = new UserDao();

        userDao.create("tetz", "1234");
    }
}
