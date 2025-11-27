package org.example;

public class User {
    public String name;
    public String role;
    private static User[] allUsers = new User[0];

    public User() {}

    public User(String name) {
        this.name = name;
        this.role = "USER";
        addUsersToMassive(name);
    }

    public String getRole() {
        return role;
    }

    public void addUsersToMassive(String name) {
        User user = new User();
        user.name = name;
        user.role = this.role;
        User[] allUsersNew = new User[allUsers.length + 1];
        for (int i = 0; i < allUsers.length; i++) {
            allUsersNew[i] = allUsers[i];
        }
        allUsersNew[allUsersNew.length - 1] = user;
        allUsers = allUsersNew;
    }

    public String toString() {
        return role + " " + name;
    }

    public void printAllUsers() {
        for (User user : allUsers) {
            System.out.println(user);
        }
    }
}
