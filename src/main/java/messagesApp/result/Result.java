package messagesApp.result;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private boolean success;
    private Map<String, String> rows;

    public Result () {

    }

    public Result (boolean successCode) {
        this.success = successCode;
    }

    public Result (boolean success, HashMap<String, String> rows) {
        this.success = success;
        this.rows = rows;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, String> getRows() {
        return rows;
    }

    public void setRows(Map<String, String> rows) {
        this.rows = rows;
    }
}
