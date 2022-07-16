package org.java.projects;

public class Print implements PrintMessage{
    private String message;

    @Override
    public String showStrMessages() {
        return message;
    }
}