package messagesApp.configuration;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class ReadConfig {
    public static ArrayList<String> getPropValues() {
        ArrayList<String> propertiesList = new ArrayList<String>();
        try {
            Properties properties = new Properties();
            String propertiesFileName = "dev.properties";
            InputStream inputStream = ReadConfig.class.getClassLoader().getResourceAsStream(propertiesFileName);

            if (inputStream != null) properties.load(inputStream);
            else
                throw new FileNotFoundException("Property file: " + propertiesFileName + " not found in the classpath.");

            for (int i = 0; i < 3; i++) {
                propertiesList.add(properties.getProperty("url"));
                propertiesList.add(properties.getProperty("user"));
                propertiesList.add(properties.getProperty("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return propertiesList;
    }
}
