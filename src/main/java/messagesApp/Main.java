package messagesApp;

import messagesApp.dbConnection.PostgresConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = PostgresConnection.getConnection();
        System.out.println(connection);
    }
}
