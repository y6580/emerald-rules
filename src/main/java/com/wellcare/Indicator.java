
package com.wellcare;

import java.io.Serializable;

public class Indicator implements Serializable
{

    private int effectiveEndDT;
    private int effectiveStartDT;
    private int enrollmentRequestIndicatorSurrogateKey;
    private int enrollmentRequestSurrogateKey;
    private String indicatorTypeCode;
    private int indicatorValue;
    private final static long serialVersionUID = -4508831679756049930L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Indicator() {
    }

    /**
     * 
     * @param effectiveEndDT
     * @param enrollmentRequestSurrogateKey
     * @param indicatorTypeCode
     * @param effectiveStartDT
     * @param enrollmentRequestIndicatorSurrogateKey
     * @param indicatorValue
     */
    public Indicator(int effectiveEndDT, int effectiveStartDT, int enrollmentRequestIndicatorSurrogateKey, int enrollmentRequestSurrogateKey, String indicatorTypeCode, int indicatorValue) {
        super();
        this.effectiveEndDT = effectiveEndDT;
        this.effectiveStartDT = effectiveStartDT;
        this.enrollmentRequestIndicatorSurrogateKey = enrollmentRequestIndicatorSurrogateKey;
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
        this.indicatorTypeCode = indicatorTypeCode;
        this.indicatorValue = indicatorValue;
    }

    public int getEffectiveEndDT() {
        return effectiveEndDT;
    }

    public void setEffectiveEndDT(int effectiveEndDT) {
        this.effectiveEndDT = effectiveEndDT;
    }

    public int getEffectiveStartDT() {
        return effectiveStartDT;
    }

    public void setEffectiveStartDT(int effectiveStartDT) {
        this.effectiveStartDT = effectiveStartDT;
    }

    public int getEnrollmentRequestIndicatorSurrogateKey() {
        return enrollmentRequestIndicatorSurrogateKey;
    }

    public void setEnrollmentRequestIndicatorSurrogateKey(int enrollmentRequestIndicatorSurrogateKey) {
        this.enrollmentRequestIndicatorSurrogateKey = enrollmentRequestIndicatorSurrogateKey;
    }

    public int getEnrollmentRequestSurrogateKey() {
        return enrollmentRequestSurrogateKey;
    }

    public void setEnrollmentRequestSurrogateKey(int enrollmentRequestSurrogateKey) {
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

    public String getIndicatorTypeCode() {
        return indicatorTypeCode;
    }

    public void setIndicatorTypeCode(String indicatorTypeCode) {
        this.indicatorTypeCode = indicatorTypeCode;
    }

    public int getIndicatorValue() {
        return indicatorValue;
    }

    public void setIndicatorValue(int indicatorValue) {
        this.indicatorValue = indicatorValue;
    }


}
