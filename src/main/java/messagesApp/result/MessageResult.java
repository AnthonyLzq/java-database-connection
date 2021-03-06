package messagesApp.result;

import messagesApp.message.Message;

import java.util.ArrayList;


public class MessageResult {
    private int deletedRow;
    private int updatedRow;
    private boolean success;
    private ArrayList<Message> rows;

    public MessageResult() {

    }

    public MessageResult(boolean successCode) {
        this.success = successCode;
    }

    public MessageResult(boolean success, ArrayList<Message> rows) {
        this.success = success;
        this.rows = rows;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ArrayList<Message> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Message> rows) {
        this.rows = rows;
    }

    public int getDeletedRow() {
        return deletedRow;
    }

    public void setDeletedRow(int deletedRow) {
        this.deletedRow = deletedRow;
    }

    public int getUpdatedRow() {
        return updatedRow;
    }

    public void setUpdatedRow(int updatedRow) {
        this.updatedRow = updatedRow;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[\n");
        for (int i = 0; i < rows.size(); i++) {
            if (i == rows.size() - 1) result.append(rows.get(i).toString()).append("\n");
            else result.append(rows.get(i).toString()).append(",\n");
        }
        result.append("]\n\n");

        return result.toString();
    }
}
