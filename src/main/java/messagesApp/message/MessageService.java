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

    public static String deleteMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id of the message you want ot delete: ");
        int id = sc.nextInt();
        MessageResult messageResult = MessageDao.deleteMessage(id);

        if (messageResult.isSuccess()) return "\nMessage deleted successfully!\n\n";
        if (messageResult.getDeletedRow() == 0) return "\nThe message was not found!\n\n";

        return "\nThere was an error trying to deleted the requested message!";
    }

    public static void updateMessage() {
    }
}
