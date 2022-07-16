package org.java.projects;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Messages message = new Messages();
        Users user = new Users(message);
        String s = user.convertMessagesToString(message);
        System.out.println(s);

        // add commit
        // add new commit
    }
}
