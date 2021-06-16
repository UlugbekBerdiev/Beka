package ClassActivity;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    private static Properties config;
    static {
        try {
            File file = new File("src/test/java/ClassActivity/config.properties");
            FileInputStream input = new FileInputStream(file );
             config = new Properties();
             config.load(input);
        } catch(Exception e){
           e.printStackTrace();

        }
    }

    public static String getProperty(String key){
        return config.getProperty(key);
    }

}

