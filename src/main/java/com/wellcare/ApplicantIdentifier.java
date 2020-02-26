
package com.wellcare;

import java.io.Serializable;

public class ApplicantIdentifier implements Serializable
{

    private int enrollmentApplicantIdentifierSurrogateKey;
    private int enrollmentRequestSurrogateKey;
    private String identifierTypeCode;
    private String identifierValue;
    private final static long serialVersionUID = -2348000034599916946L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApplicantIdentifier() {
    }

    /**
     * 
     * @param enrollmentRequestSurrogateKey
     * @param identifierValue
     * @param enrollmentApplicantIdentifierSurrogateKey
     * @param identifierTypeCode
     */
    public ApplicantIdentifier(int enrollmentApplicantIdentifierSurrogateKey, int enrollmentRequestSurrogateKey, String identifierTypeCode, String identifierValue) {
        super();
        this.enrollmentApplicantIdentifierSurrogateKey = enrollmentApplicantIdentifierSurrogateKey;
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
        this.identifierTypeCode = identifierTypeCode;
        this.identifierValue = identifierValue;
    }

    public int getEnrollmentApplicantIdentifierSurrogateKey() {
        return enrollmentApplicantIdentifierSurrogateKey;
    }

    public void setEnrollmentApplicantIdentifierSurrogateKey(int enrollmentApplicantIdentifierSurrogateKey) {
        this.enrollmentApplicantIdentifierSurrogateKey = enrollmentApplicantIdentifierSurrogateKey;
    }

    public int getEnrollmentRequestSurrogateKey() {
        return enrollmentRequestSurrogateKey;
    }

    public void setEnrollmentRequestSurrogateKey(int enrollmentRequestSurrogateKey) {
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

    public String getIdentifierTypeCode() {
        return identifierTypeCode;
    }

    public void setIdentifierTypeCode(String identifierTypeCode) {
        this.identifierTypeCode = identifierTypeCode;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

}
