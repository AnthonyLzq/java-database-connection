package messagesApp.message;

public class Message {
    private int idMessage;
    private String author;
    private String date;
    private String message;

    public Message() {

    }

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
    }

    public Message(int idMessage, String author, String message) {
        this.idMessage = idMessage;
        this.author = author;
        this.message = message;
    }

    public Message(int idMessage, String author, String date, String message) {
        this.idMessage = idMessage;
        this.author = author;
        this.date = date;
        this.message = message;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\tid: " + getIdMessage() + "," +
                "\n\tauthor: " + getAuthor() + "," +
                "\n\tmessage: " + getMessage() + "," +
                "\n\tcreationDate: " + getDate() +
                "\n}";
    }
}
