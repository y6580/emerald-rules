
package com.wellcare;

import java.io.Serializable;

public class Address implements Serializable
{

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressTypeCode;
    private String city;
    private String country;
    private String county;
    private int enrollmentRequestAddressSurrogateKey;
    private int enrollmentRequestSurrogateKey;
    private String postalCode;
    private String state;
    private final static long serialVersionUID = 6814952083983104274L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param country
     * @param enrollmentRequestSurrogateKey
     * @param addressTypeCode
     * @param enrollmentRequestAddressSurrogateKey
     * @param city
     * @param postalCode
     * @param county
     * @param addressLine1
     * @param addressLine2
     * @param addressLine3
     * @param state
     */
    public Address(String addressLine1, String addressLine2, String addressLine3, String addressTypeCode, String city, String country, String county, int enrollmentRequestAddressSurrogateKey, int enrollmentRequestSurrogateKey, String postalCode, String state) {
        super();
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressTypeCode = addressTypeCode;
        this.city = city;
        this.country = country;
        this.county = county;
        this.enrollmentRequestAddressSurrogateKey = enrollmentRequestAddressSurrogateKey;
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
        this.postalCode = postalCode;
        this.state = state;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    public void setAddressTypeCode(String addressTypeCode) {
        this.addressTypeCode = addressTypeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getEnrollmentRequestAddressSurrogateKey() {
        return enrollmentRequestAddressSurrogateKey;
    }

    public void setEnrollmentRequestAddressSurrogateKey(int enrollmentRequestAddressSurrogateKey) {
        this.enrollmentRequestAddressSurrogateKey = enrollmentRequestAddressSurrogateKey;
    }

    public int getEnrollmentRequestSurrogateKey() {
        return enrollmentRequestSurrogateKey;
    }

    public void setEnrollmentRequestSurrogateKey(int enrollmentRequestSurrogateKey) {
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



}
