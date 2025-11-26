package org.example;

import java.util.Date;

public class Message {

    private User sender;
    private User recipient;
    Date time;
    String text;

    private static Message[] messages = new Message[0];

    public Message() {};

    public Message(User sender, User recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        time = new Date();
        this.text = text;
        addMessageToMassive(sender, recipient, time, text);
    }

    private void setSender(User sender) {
        this.sender = sender;
    }

    private void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    private void setText(String text) {
        this.text = text;
    }

    private void setTime(Date time) {
        this.time = time;
    }

    private void addMessageToMassive(User sender, User recipient, Date time, String text) {
        Message message = new Message();
        message.sender = sender;
        message.recipient = recipient;
        message.time = time;
        message.text = text;
        Message[] messagesCopy = new Message[messages.length + 1];
        messagesCopy[messages.length] = message;
        for (int i = 0; i < messages.length; ++i) {
            messagesCopy[i] = messages[i];
        }
        messages = messagesCopy;
    }

    public void printAllMessages() {
        for (Message message : messages) {
            System.out.println(message);
        }
    }

    public String toString() {
        return "Отправитель: " + sender + ", получатель: " + recipient + ", время отправки: " + time + ", текст сообщения: " + text + ".";
    }
}
