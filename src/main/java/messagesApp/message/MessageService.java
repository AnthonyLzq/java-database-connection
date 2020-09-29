package messagesApp.message;

import java.util.Scanner;

public class MessageService {
    public static void createMessage () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a message: ");
        String messageContent = sc.nextLine();
        System.out.print("Write the author: ");
        String messageAuthor = sc.nextLine();

        Message newMessage = new Message(messageContent, messageAuthor);
        MessageDao.createMessage(newMessage);
    }

    public static void listMessages () {
    }

    public static void deleteMessage () {
    }

    public static void updateMessage () {
    }
}
