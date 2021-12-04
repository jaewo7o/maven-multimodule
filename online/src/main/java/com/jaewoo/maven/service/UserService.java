package com.jaewoo.maven.service;

import com.jaewoo.maven.entity.User;

public class UserService {
    public User getUser() {
        User user = new User();
        user.setName("J.J.W");
        user.setEmail("jeawoo.jeong@gmail.com");

        System.out.println("user = " + user);

        return user;
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.getUser();
    }
}
