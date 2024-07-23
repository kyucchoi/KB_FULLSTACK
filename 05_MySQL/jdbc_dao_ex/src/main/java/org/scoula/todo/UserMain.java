package org.scoula.todo;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

//        UserVo tetz2 = new UserVo(1, "tetz2", "1234");
//
//        System.out.println(tetz2);

//        userDao.create("tetz2", "1234");

//        userDao.getAllUsers();

//        userDao.UpdateUser("craig", "abcd", 4);
//        userDao.getAllUsers();

//        userDao.deleteUser(4);
//        userDao.getAllUsers();

        userDao.getAllUsersWithName();
    }
}
