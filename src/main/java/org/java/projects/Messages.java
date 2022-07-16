package org.java.projects;

public class Messages implements PrintMessage{
    private String message;

    @Override
    public String showMessagesString() {
        return message;
    }
}