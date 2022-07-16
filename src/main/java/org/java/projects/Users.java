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
    public Users(Users user, Messages message) {
        this.user = user;
        this.message = message;
    }

    /**
     *
     * @return message
     */
    public String convertMessagesToString (Messages message) {
        return message.toString();
    }
    /**
     * Set message
     * @param message with one introduce parameter
     */
    public void setMessages(Messages message) {
        this.message = message;
    }

    /**
     * Get message
     * @param message with one introduce parameter
     * @return message
     */

    public Messages getMessage(Messages message) {
        return message;
    }

    // add commit
}