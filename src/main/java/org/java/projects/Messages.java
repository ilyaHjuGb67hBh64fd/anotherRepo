package org.java.projects;

public class Messages implements PrintMessage{
    private String message;
    public Messages() {
    }
    public Messages(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String showStrMessages() {
        return message;
    }
}