package propertiesfile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
    public static void main(String[] args) {

        //loading the property file
        Properties prop = new Properties();
        try {
            // load a properties file for reading
            prop.load(new FileInputStream("myConfig.properties"));
            // get the properties and print
            prop.list(System.out);
            //Reading each property value
            System.out.println(prop.getProperty("FileName"));
            System.out.println(prop.getProperty("Author_Name"));
            System.out.println(prop.getProperty("Website"));
            System.out.println(prop.getProperty("TOPIC"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //writing to a property file
        //a new file is created if the file name doesn't exist. Otherwise, it just replaces the old property file.
        Properties prop2 = new Properties();
        try {
            // set the properties value
            prop2.setProperty("Gujarat", "Gandhinagar");
            prop2.setProperty("Maharashtra", "Mumbai");
            prop2.setProperty("Madhya_Pradesh", "Indore");
            prop2.setProperty("Uttar_Pradesh", "Lucknow");
            // save properties to project root folder
            prop2.store(new FileOutputStream("capitals.properties"), null);

            prop2.setProperty("Illinois", "Springfield"); //adds Illinois
            prop2.setProperty("Texas", "Dallas"); //adds Texas
            prop2.setProperty("Illinois", "Blah"); //replaces Springfield

            prop2.store(new FileOutputStream("capitals.properties"), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}