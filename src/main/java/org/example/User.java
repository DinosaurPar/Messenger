package org.example;

public class User {
    private String name;
    public String role;
    private static User[] allUsers = new User[0];

    public User(String name) {
        this.name = name;
        addUsersToMassive(name);
    }

    public String getRole() {
        return role;
    }

    private void addUsersToMassive(String name) {
        User[] allUsersNew = new User[allUsers.length + 1];
        for (int i = 0; i < allUsers.length; i++) {
            allUsersNew[i] = allUsers[i];
        }
        allUsersNew[allUsersNew.length - 1] = new User(name);
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
