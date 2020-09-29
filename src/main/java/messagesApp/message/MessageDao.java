package messagesApp.message;

import messagesApp.global.Global;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDao {
    public static boolean createMessage (Message message) {
        PreparedStatement ps;
        boolean successCode;
        try {
            String query = "INSERT INTO messages (message, author) VALUES (?, ?)";
            ps = Global.psqlConnection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthor());
            ps.executeUpdate();
            successCode = true;
        } catch (SQLException e) {
            e.printStackTrace();
            successCode = false;
        }

        return successCode;
    }

    public static void readMessage () {
    }

    public static void deleteMessage (int idMessage) {
    }

    public static void updateMessage (Message message) {
    }
}
