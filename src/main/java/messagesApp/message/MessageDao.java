package messagesApp.message;

import messagesApp.global.Global;
import messagesApp.result.Result;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDao {
    public static Result createMessage (Message message) {
        PreparedStatement ps;
        Result result = new Result();
        try {
            String query = "INSERT INTO messages (message, author) VALUES (?, ?)";
            ps = Global.psqlConnection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthor());
            ps.executeUpdate();
            result.setSuccess(true);
        } catch (SQLException e) {
            e.printStackTrace();
            result.setSuccess(false);
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
