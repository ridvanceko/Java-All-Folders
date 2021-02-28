package test.java.selenium.properties;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesIntro {

    @Test

    public void testProperties() throws IOException {

        File propertiesFile = new File("src/test/resources/configurations.properties");

        Properties properties = new Properties();
        properties.load(new FileInputStream(propertiesFile));

        String url = properties.getProperty("url");
        System.out.println(url);
    }

    @Test
    public void testProperties2() throws IOException {
        File credsFile = new File("src/test/resources/credentiais.properties");
        Properties properties = new Properties();
        properties.load(new FileInputStream(credsFile));

        String env = properties.getProperty("browser", "chrome");
        System.out.println(env);
    }

    public static String readProperty(String fileName, String key) {
        File propFile = new File(fileName);
        Properties properties = new Properties();

        try{
            properties.load(new FileInputStream(propFile));

        } catch (IOException exception) {
            throw  new RuntimeException("Could not read from properties file: " + fileName)
        }
        return properties.getProperty(key);
    }
}
