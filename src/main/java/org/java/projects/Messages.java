package org.java.projects;

public class Messages implements PrintMessage{
    private String message;

    @Override
    public String showStrMessages() {
        return message;
    }
}