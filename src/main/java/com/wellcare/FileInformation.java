
package com.wellcare;

import java.io.Serializable;

public class FileInformation implements Serializable
{

    private int enrollmentRequestFileInformationSurrogateKey;
    private String enrollmentRequestSource;
    private int enrollmentRequestSurrogateKey;
    private String fileIdentifierTypeCode;
    private String fileIdentifierValue;
    private int fileReceivedTS;
    private String fileTypeCode;
    private String filename;
    private final static long serialVersionUID = -7850417263085878514L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileInformation() {
    }

    /**
     * 
     * @param fileTypeCode
     * @param enrollmentRequestSurrogateKey
     * @param enrollmentRequestFileInformationSurrogateKey
     * @param enrollmentRequestSource
     * @param filename
     * @param fileIdentifierTypeCode
     * @param fileIdentifierValue
     * @param fileReceivedTS
     */
    public FileInformation(int enrollmentRequestFileInformationSurrogateKey, String enrollmentRequestSource, int enrollmentRequestSurrogateKey, String fileIdentifierTypeCode, String fileIdentifierValue, int fileReceivedTS, String fileTypeCode, String filename) {
        super();
        this.enrollmentRequestFileInformationSurrogateKey = enrollmentRequestFileInformationSurrogateKey;
        this.enrollmentRequestSource = enrollmentRequestSource;
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
        this.fileIdentifierTypeCode = fileIdentifierTypeCode;
        this.fileIdentifierValue = fileIdentifierValue;
        this.fileReceivedTS = fileReceivedTS;
        this.fileTypeCode = fileTypeCode;
        this.filename = filename;
    }

    public int getEnrollmentRequestFileInformationSurrogateKey() {
        return enrollmentRequestFileInformationSurrogateKey;
    }

    public void setEnrollmentRequestFileInformationSurrogateKey(int enrollmentRequestFileInformationSurrogateKey) {
        this.enrollmentRequestFileInformationSurrogateKey = enrollmentRequestFileInformationSurrogateKey;
    }

    public String getEnrollmentRequestSource() {
        return enrollmentRequestSource;
    }

    public void setEnrollmentRequestSource(String enrollmentRequestSource) {
        this.enrollmentRequestSource = enrollmentRequestSource;
    }

    public int getEnrollmentRequestSurrogateKey() {
        return enrollmentRequestSurrogateKey;
    }

    public void setEnrollmentRequestSurrogateKey(int enrollmentRequestSurrogateKey) {
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

    public String getFileIdentifierTypeCode() {
        return fileIdentifierTypeCode;
    }

    public void setFileIdentifierTypeCode(String fileIdentifierTypeCode) {
        this.fileIdentifierTypeCode = fileIdentifierTypeCode;
    }

    public String getFileIdentifierValue() {
        return fileIdentifierValue;
    }

    public void setFileIdentifierValue(String fileIdentifierValue) {
        this.fileIdentifierValue = fileIdentifierValue;
    }

    public int getFileReceivedTS() {
        return fileReceivedTS;
    }

    public void setFileReceivedTS(int fileReceivedTS) {
        this.fileReceivedTS = fileReceivedTS;
    }

    public String getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(String fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

}
