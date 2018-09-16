package propertiesexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
public class Propertiesexample {
    public static void main(String[] args) throws FileNotFoundException {
        Properties p = new Properties();
        p = System.getProperties();
        FileOutputStream fos = new FileOutputStream("My PC properties.File");
        p.save(fos, "Pandu");
        System.out.println("OS name: " + p.getProperty("os.name"));
        System.out.println("OS version: " + p.getProperty("os.version"));
        System.out.println("Java version: " + p.getProperty("java version"));
        System.out.println("Username: " + p.getProperty("username"));

    }

}


