package messagesApp;

import messagesApp.dbConnection.PostgresConnection;
import messagesApp.global.Global;
import messagesApp.message.MessageService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Global.psqlConnection = PostgresConnection.getConnection();
        String result;
        int option = 0;
        do {
            System.out.println("Messages application");
            System.out.println("1. Create message");
            System.out.println("2. List messages");
            System.out.println("3. Delete message");
            System.out.println("4. Update message");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    result = MessageService.createMessage();
                    System.out.println(result);
                    break;
                case 2:
                    result = MessageService.listMessages();
                    System.out.println(result);
                    break;
                case 3:
                    result = MessageService.deleteMessage();
                    System.out.println(result);
                    break;
                case 4:
                    MessageService.updateMessage();
                    break;
                default:
                    break;
            }
        } while (option != 5);
    }
}
