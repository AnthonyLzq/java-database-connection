package messagesApp.message;

import messagesApp.global.Global;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDao {
    public static void createMessage (Message message) {
        PreparedStatement ps;
        try {
            String query = "INSERT INTO messages (message, author) VALUES (?, ?)";
            ps = Global.psqlConnection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthor());
            ps.executeUpdate();
            System.out.println("\nMessage created successfully!\n\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readMessage () {
    }

    public static void deleteMessage (int idMessage) {
    }

    public static void updateMessage (Message message) {
    }
}
