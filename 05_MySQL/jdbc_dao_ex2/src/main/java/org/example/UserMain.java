package org.example;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

//        UserVo tetz2 = new UserVo(0, "tetz2", "1234");
//        userDao.addUser(tetz2);

//        userDao.updateUser(11, "craig", "abcd");

//        userDao.deleteUser(11);
        userDao.getAllUsers();
    }
}
