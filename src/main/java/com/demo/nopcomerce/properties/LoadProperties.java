package com.demo.nopcomerce.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jay Vaghani on 04/05/2019.
 */
public class LoadProperties {
    static Properties prop;

    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream("C:\\Prime Git Hub Project\\sample-nopcommerce-maven-project\\src\\test\\java\\com\\demo\\nopcomerce\\resources\\configfile\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
