
package com.wellcare;

import java.io.Serializable;

public class Message implements Serializable
{

    private String messageCode;
    private String messageText;
    private int enrollmentRequestIdentifier;
    private final static long serialVersionUID = -3762762361404975175L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    /**
     * 
     * @param messageCode
     * @param messageText
     * @param enrollmentRequestIdentifier
     */
    public Message(String messageCode, String messageText, int enrollmentRequestIdentifier) {
        super();
        this.messageCode = messageCode;
        this.messageText = messageText;
        this.enrollmentRequestIdentifier = enrollmentRequestIdentifier;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public int getEnrollmentRequestIdentifier() {
        return enrollmentRequestIdentifier;
    }

    public void setEnrollmentRequestIdentifier(int enrollmentRequestIdentifier) {
        this.enrollmentRequestIdentifier = enrollmentRequestIdentifier;
    }


}
