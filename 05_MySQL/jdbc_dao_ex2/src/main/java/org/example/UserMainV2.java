package org.example;

public class UserMainV2 {
    public static void main(String[] args) {
        UserDaoV2 userDao = new UserDaoV2();

        userDao.close();
    }
}
