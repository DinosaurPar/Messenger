package org.example;

public class Main {
    public static void main(String[] args) {
        User zarina = new User("Zarina");
        User kamil = new User("Kamil");
        User alexey = new User("Alexey");
        Group school = new Group("School", zarina, alexey);
        school.addNewUser(kamil);
        Channel meow = new Channel("Meow", alexey, kamil);
        meow.addNewUser(zarina);
        Message message1 = new Message(kamil, alexey, "Hello!");
        Message message2 = new Message(alexey, kamil, "Hi");
        school.sendMessageToGroup(alexey, school, "Good morning!");
        meow.sendMessageToChannel(alexey, meow, "Я устал");
        meow.sendMessageToChannel(kamil, meow, "Я тоже");
        System.out.println("Все пользователи:");
        zarina.printAllUsers();
        System.out.println("Все участники группы School:");
        school.showUsers();
        System.out.println("Все участники канала Meow:");
        meow.showUsers();
        message1.printAllMessages();
    }
}