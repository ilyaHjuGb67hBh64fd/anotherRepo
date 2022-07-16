package org.java.projects;

public class Print implements PrintMessage{
    private String message;

//    ArrayList<String> messages = new ArrayList<String>();
//    messages.add("df");
//    messages.add("dsdf");

    @Override
    public String showMessagesString() {
        return message;
    }
}