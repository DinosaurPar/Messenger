package org.example;

import java.util.Date;

public class Group {
    private User[] users = new User[2];
    Message message;

    public Group(User user1, User user2) {
        users[0] = user1;
        users[1] = user2;
    }

    public void addNewUser(User user) {
        User[] users1 = new User[users.length + 1];
        for (int i = 0; i < users.length; i ++) {
            users1[i] = users[i];
        }
        users1[users1.length - 1] = user;
        users = users1;
    }

    public void sendMessageToGroup(User sender, User recipient, Date time, String text) {
        this.message = new Message(sender, recipient, text);
    }

    public void openGroup() {
        message.printAllMessages();
    }

    public void showUsers() {
        for (User user: users) {
            System.out.println(user);
        }
    }
}
