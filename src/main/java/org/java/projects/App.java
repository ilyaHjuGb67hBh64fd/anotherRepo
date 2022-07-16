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

        Messages messages = new Messages();
        Users user = new Users(messages);
        user.getMessages();
        // add commit
    }
}
