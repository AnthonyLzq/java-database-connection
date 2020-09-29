package messagesApp.message;

import messagesApp.result.MessageResult;

import java.util.Scanner;

public class MessageService {
    public static String createMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a message: ");
        String messageContent = sc.nextLine();
        System.out.print("Write the author: ");
        String messageAuthor = sc.nextLine();

        Message newMessage = new Message(messageContent, messageAuthor);
        MessageResult messageResult = MessageDao.createMessage(newMessage);
        if (messageResult.isSuccess()) return "\nMessage created successfully!\n\n";

        return "\nThere was an error trying to create the requested message!";
    }

    public static String listMessages() {
        MessageResult messageResult = MessageDao.readMessages();
        if (messageResult.isSuccess()) return "\nMessages:\n" + messageResult.toString();

        return "\nThere was an error trying to get all the messages!";
    }

    public static void deleteMessage() {
    }

    public static void updateMessage() {
    }
}
