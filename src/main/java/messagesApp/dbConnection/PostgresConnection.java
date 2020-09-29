package messagesApp.dbConnection;

import messagesApp.configuration.ReadConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class PostgresConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            ArrayList<String> properties = ReadConfig.getPropValues();
            /*
             * properties[0]: url
             * properties[1]: user
             * properties[2]: password
             */
            connection = DriverManager.getConnection(properties.get(0), properties.get(1), properties.get(2));
            if (connection != null) System.out.println("Connection established");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return connection;
    }
}
