package org.example;

import java.util.Date;

public class Channel {
    private User[] users = new User[2];
    Message message;

    public Channel(User userAdmin, User user2) {
        userAdmin.role = "ADMIN";
        users[0] = userAdmin;
        user2.role = "USER";
        users[1] = user2;
    }

    public void addNewUser(User user) {
        User[] users1 = new User[users.length + 1];
        for (int i = 0; i < users.length; i ++) {
            users1[i] = users[i];
        }
        user.role = "USER";
        users1[users1.length - 1] = user;
        users = users1;
    }

    public String sendMessageToChannel(User sender, User recipient, Date time, String text) {
        if (sender.getRole().equals("ADMIN")) {
            this.message = new Message(sender, recipient, text);
            return "Content posted successfully";
        }
        else {
            return "This user doesn't have permissions";
        }
    }

    public void openChannel() {
        message.printAllMessages();
    }

    public void showUsers() {
        for (User user: users) {
            System.out.println(user);
        }
    }
}
