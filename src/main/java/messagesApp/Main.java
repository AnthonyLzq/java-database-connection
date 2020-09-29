package messagesApp;

import messagesApp.dbConnection.PostgresConnection;
import messagesApp.message.MessageService;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostgresConnection.getConnection();
        int option = 0;
        do {
            System.out.println("Messages application");
            System.out.println("1. Create message");
            System.out.println("2. List messages");
            System.out.println("3. Update message");
            System.out.println("4. Delete message");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessages();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    break;
            }
        } while(option != 5);
    }
}
