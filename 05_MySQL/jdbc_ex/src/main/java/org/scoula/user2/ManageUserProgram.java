package org.scoula.user2;

import org.scoula.user.ManageUser;

import java.util.Scanner;

public class ManageUserProgram {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        userDAO.getAllUsers();
    }
}
