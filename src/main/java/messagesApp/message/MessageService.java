package messagesApp.message;

import java.util.Map;
import java.util.Scanner;

public class MessageService {
    public static String createMessage () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a message: ");
        String messageContent = sc.nextLine();
        System.out.print("Write the author: ");
        String messageAuthor = sc.nextLine();

        Message newMessage = new Message(messageContent, messageAuthor);
        Map<Integer, Boolean> result = MessageDao.createMessage(newMessage);
        if (result.get(1)) return "\nMessage created successfully!\n\n";

        return "\nThere was an error trying to create the requested message!";
    }

    public static void listMessages () {
    }

    public static void deleteMessage () {
    }

    public static void updateMessage () {
    }
}
