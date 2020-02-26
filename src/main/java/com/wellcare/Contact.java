
package com.wellcare;

import java.io.Serializable;

public class Contact implements Serializable
{

    private String contactTypeCode;
    private String contactValue;
    private int enrollmentRequestContactSurrogateKey;
    private int enrollmentRequestSurrogateKey;
    private final static long serialVersionUID = -3762762361404975175L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Contact() {
    }

    /**
     * 
     * @param enrollmentRequestSurrogateKey
     * @param contactTypeCode
     * @param contactValue
     * @param enrollmentRequestContactSurrogateKey
     */
    public Contact(String contactTypeCode, String contactValue, int enrollmentRequestContactSurrogateKey, int enrollmentRequestSurrogateKey) {
        super();
        this.contactTypeCode = contactTypeCode;
        this.contactValue = contactValue;
        this.enrollmentRequestContactSurrogateKey = enrollmentRequestContactSurrogateKey;
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

    public String getContactTypeCode() {
        return contactTypeCode;
    }

    public void setContactTypeCode(String contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public int getEnrollmentRequestContactSurrogateKey() {
        return enrollmentRequestContactSurrogateKey;
    }

    public void setEnrollmentRequestContactSurrogateKey(int enrollmentRequestContactSurrogateKey) {
        this.enrollmentRequestContactSurrogateKey = enrollmentRequestContactSurrogateKey;
    }

    public int getEnrollmentRequestSurrogateKey() {
        return enrollmentRequestSurrogateKey;
    }

    public void setEnrollmentRequestSurrogateKey(int enrollmentRequestSurrogateKey) {
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

}
