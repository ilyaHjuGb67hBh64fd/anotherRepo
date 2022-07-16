package org.java.projects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Messages messages = new Messages();
        Users user = new Users(messages);
        user.showMessage(messages.showMessagesString());


    }
}
