package org.java.projects;

import sun.awt.AWTAccessor;

public class Users implements ShowMessage {
    private Users user;
    private Messages message;

    public Users(Users user){
        this.user = user;
    }
    public Users(Messages message){
        this.message = message;
    }
    public Users(Users user, Messages messages) {
        this.user = user;
        this.message = messages;
    }
    public Messages getMessages() {
        return message;
    }
    public void setMessages(Messages messages) {
        this.message = messages;
    }
    @Override
    public Messages getMessage(String messages) {
        return message;
    }
}