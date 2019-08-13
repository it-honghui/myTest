package com.wanghonghui.test;

import com.wanghonghui.model.User;

import java.util.ArrayList;
import java.util.List;

public class SwitchCaseTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUserName("a");
        user.setAge("1");

        User user1 = new User();
        user1.setUserName("b");
        user1.setAge("2");

        User user2 = new User();
        user2.setUserName("c");
        user2.setAge("3");

        User user3 = new User();
        user3.setUserName("d");
        user3.setAge("4");

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User u : list) {

            switch (u.getUserName()) {
                case "a":

                    break;
                case "b":
                    break;
                case "c":
                    break;
                case "d":
                    break;
            }
        }
    }

}
