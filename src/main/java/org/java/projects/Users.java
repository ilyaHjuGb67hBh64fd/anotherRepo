package org.java.projects;

import sun.awt.AWTAccessor;

public class Users implements ShowMessage {
    private Users user;
    private Messages messages;
    public Users(Users user) {
        this.user = user;
    }
    public Users(Messages messages) {
        this.messages = messages;
    }
    public Messages getMessages() {
        return messages;
    }
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    @Override
    public Messages getMessage(String messages) {
        return null;
    }
}