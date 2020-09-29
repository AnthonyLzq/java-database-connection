package messagesApp.message;

import messagesApp.global.Global;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MessageDao {
    public static Map<Integer, Boolean> createMessage (Message message) {
        PreparedStatement ps;
        Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();
        try {
            String query = "INSERT INTO messages (message, author) VALUES (?, ?)";
            ps = Global.psqlConnection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthor());
            ps.executeUpdate();
            result.put(1, true);
        } catch (SQLException e) {
            e.printStackTrace();
            result.put(1, false);
        }

        return result;
    }

    public static void readMessage () {
    }

    public static void deleteMessage (int idMessage) {
    }

    public static void updateMessage (Message message) {
    }
}
