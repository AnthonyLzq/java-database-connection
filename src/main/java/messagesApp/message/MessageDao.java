package messagesApp.message;

import messagesApp.global.Global;
import messagesApp.result.MessageResult;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDao {
    public static MessageResult createMessage(Message message) {
        PreparedStatement ps;
        MessageResult messageResult = new MessageResult();
        try {
            String query = "INSERT INTO messages (message, author) VALUES (?, ?)";
            ps = Global.psqlConnection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthor());
            ps.executeUpdate();
            messageResult.setSuccess(true);
        } catch (SQLException e) {
            e.printStackTrace();
            messageResult.setSuccess(false);
        }

        return messageResult;
    }

    public static MessageResult readMessages() {
        PreparedStatement ps;
        ResultSet rs;
        MessageResult messageResult = new MessageResult();
        ArrayList<Message> rows = new ArrayList<Message>();
        Message row;
        try {
            String query = "SELECT * FROM messages";
            ps = Global.psqlConnection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                row = new Message(
                        rs.getInt("id"),
                        rs.getString("message"),
                        rs.getString("author"),
                        rs.getString("date")
                );
                rows.add(row);
            }

            messageResult.setSuccess(true);
            messageResult.setRows(rows);
        } catch (SQLException e) {
            e.printStackTrace();
            messageResult.setSuccess(false);
        }

        return messageResult;
    }

    public static void deleteMessage(int idMessage) {
    }

    public static void updateMessage(Message message) {
    }
}
