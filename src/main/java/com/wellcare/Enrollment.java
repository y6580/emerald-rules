
package com.wellcare;

import java.io.Serializable;
import java.util.List;

public class Enrollment implements Serializable
{

    private String enrollmentRequestIdentifier;
    private List<Address> addresses = null;
    private int applicantDOB;
    private String applicantFirstName;
    private List<ApplicantIdentifier> applicantIdentifiers = null;
    private String applicantLastName;
    private String applicantLawfulPresenceStatusTypeCode;
    private String applicantMiddleName;
    private String applicantOtherCoverageGroupIdentifier;
    private String applicantOtherCoverageIdentifier;
    private String applicantOtherCoverageName;
    private String applicantPrefix;
    private String applicantPrescriptionDrugCoverageGroupIdentifier;
    private String applicantPrescriptionDrugCoverageName;
    private String applicantPrescriptionDrugCoveragePartDBin;
    private String applicantPrescriptionDrugCoveragePartDProcessorControlNumber;
    private String applicantSuffix;
    private String applicantWorkStatusTypeCode;
    private String authorizedRepresentativeFirstName;
    private String authorizedRepresentativeLastName;
    private String authorizedRepresentativeRelationshipTypeCode;
    private String authorizedRepresentativeTypeCode;
    private String bankAccountHolderFirstName;
    private String bankAccountHolderLastName;
    private String bankAccountNumber;
    private String bankAccountRoutingNumber;
    private String bankAccountTypeCode;
    private String bankName;
    private String bcrcDocumentControlNumber;
    private String benefitPlanIdentifier;
    private String benefitPlanName;
    private String benefitPlanSegmentIdentifier;
    private List<Contact> contacts = null;
    private String contractIdentifier;
    private String deemedCopayLevelIdentifier;
    private String deemedEligibleReasonTypeCode;
    private String documentControlNumber;
    private String dualStatusTypeCode;
    private String emergencyContactFirstName;
    private String emergencyContactLastName;
    private String emergencyContactRelationshipTypeCode;
    private int enrollmentRequestApplicationTS;
    private String enrollmentRequestPlanYear;
    private String enrollmentRequestSourceTypeCode;
    private String enrollmentRequestStatusTypeCode;
    private int enrollmentRequestSubmissionTS;
    private int enrollmentRequestSurrogateKey;
    private String enrollmentRequestTypeCode;
    private int enrollmentRequestVersion;
    private List<FileInformation> fileInformations = null;
    private String genderTypeCode;
    private int incomePercentOfFederalPL;
    private List<Indicator> indicators = null;
    private String languageTypeCode;
    private String lineOfBusinessTypeCode;
    private String lisCopayLevelIdentifier;
    private String lisDeterminationSourceTypeCode;
    private String longTermCareFacilityName;
    private String medicaidLevel;
    private String medicareCardholderName;
    private String networkIdentifier;
    private String networkName;
    private String partDPlanBenefitPackageIdentifier;
    private String partDPlanContractorNumber;
    private int partDPremiumAMT;
    private String partDSubsidyDeterminationTypeCode;
    private int premiumAmountPerM;
    private String premiumWithholdSource;
    private String prescriptionCurrentDispositionTypeCode;
    private String primaryCarePhysicianFirstName;
    private String primaryCarePhysicianIdentifier;
    private String primaryCarePhysicianLastName;
    private String sepCmsReasonTypeCode;
    private String sepReasonTypeCode;
    private String spapAppealResultTypeCode;
    private String spapInsuranceTypeCode;
    private String sponsorEnrollmentPortalAgentIdentifier;
    private int subsidyCoveredPCT;
    private final static long serialVersionUID = 4801193572911484939L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Enrollment() {
    }

    /**
     * 
     * @param enrollmentRequestPlanYear
     * @param medicaidLevel
     * @param addresses
     * @param applicantPrescriptionDrugCoveragePartDProcessorControlNumber
     * @param spapAppealResultTypeCode
     * @param bankAccountTypeCode
     * @param enrollmentRequestTypeCode
     * @param partDSubsidyDeterminationTypeCode
     * @param authorizedRepresentativeLastName
     * @param networkName
     * @param premiumAmountPerM
     * @param authorizedRepresentativeFirstName
     * @param dualStatusTypeCode
     * @param enrollmentRequestSubmissionTS
     * @param emergencyContactRelationshipTypeCode
     * @param applicantPrescriptionDrugCoveragePartDBin
     * @param applicantOtherCoverageGroupIdentifier
     * @param benefitPlanSegmentIdentifier
     * @param partDPlanBenefitPackageIdentifier
     * @param primaryCarePhysicianIdentifier
     * @param contractIdentifier
     * @param applicantSuffix
     * @param bankAccountRoutingNumber
     * @param networkIdentifier
     * @param authorizedRepresentativeRelationshipTypeCode
     * @param spapInsuranceTypeCode
     * @param lineOfBusinessTypeCode
     * @param enrollmentRequestIdentifier
     * @param emergencyContactLastName
     * @param applicantLastName
     * @param applicantPrescriptionDrugCoverageGroupIdentifier
     * @param enrollmentRequestVersion
     * @param genderTypeCode
     * @param languageTypeCode
     * @param sponsorEnrollmentPortalAgentIdentifier
     * @param applicantWorkStatusTypeCode
     * @param applicantPrefix
     * @param applicantPrescriptionDrugCoverageName
     * @param applicantFirstName
     * @param indicators
     * @param incomePercentOfFederalPL
     * @param benefitPlanIdentifier
     * @param partDPremiumAMT
     * @param deemedEligibleReasonTypeCode
     * @param medicareCardholderName
     * @param fileInformations
     * @param premiumWithholdSource
     * @param longTermCareFacilityName
     * @param applicantMiddleName
     * @param bankName
     * @param emergencyContactFirstName
     * @param primaryCarePhysicianFirstName
     * @param sepReasonTypeCode
     * @param benefitPlanName
     * @param documentControlNumber
     * @param enrollmentRequestSurrogateKey
     * @param lisDeterminationSourceTypeCode
     * @param applicantOtherCoverageName
     * @param enrollmentRequestStatusTypeCode
     * @param bcrcDocumentControlNumber
     * @param applicantDOB
     * @param bankAccountNumber
     * @param deemedCopayLevelIdentifier
     * @param applicantIdentifiers
     * @param applicantOtherCoverageIdentifier
     * @param enrollmentRequestSourceTypeCode
     * @param bankAccountHolderLastName
     * @param prescriptionCurrentDispositionTypeCode
     * @param authorizedRepresentativeTypeCode
     * @param lisCopayLevelIdentifier
     * @param subsidyCoveredPCT
     * @param applicantLawfulPresenceStatusTypeCode
     * @param bankAccountHolderFirstName
     * @param enrollmentRequestApplicationTS
     * @param primaryCarePhysicianLastName
     * @param partDPlanContractorNumber
     * @param sepCmsReasonTypeCode
     * @param contacts
     */
    public Enrollment(String enrollmentRequestIdentifier, List<Address> addresses, int applicantDOB, String applicantFirstName, List<ApplicantIdentifier> applicantIdentifiers, String applicantLastName, String applicantLawfulPresenceStatusTypeCode, String applicantMiddleName, String applicantOtherCoverageGroupIdentifier, String applicantOtherCoverageIdentifier, String applicantOtherCoverageName, String applicantPrefix, String applicantPrescriptionDrugCoverageGroupIdentifier, String applicantPrescriptionDrugCoverageName, String applicantPrescriptionDrugCoveragePartDBin, String applicantPrescriptionDrugCoveragePartDProcessorControlNumber, String applicantSuffix, String applicantWorkStatusTypeCode, String authorizedRepresentativeFirstName, String authorizedRepresentativeLastName, String authorizedRepresentativeRelationshipTypeCode, String authorizedRepresentativeTypeCode, String bankAccountHolderFirstName, String bankAccountHolderLastName, String bankAccountNumber, String bankAccountRoutingNumber, String bankAccountTypeCode, String bankName, String bcrcDocumentControlNumber, String benefitPlanIdentifier, String benefitPlanName, String benefitPlanSegmentIdentifier, List<Contact> contacts, String contractIdentifier, String deemedCopayLevelIdentifier, String deemedEligibleReasonTypeCode, String documentControlNumber, String dualStatusTypeCode, String emergencyContactFirstName, String emergencyContactLastName, String emergencyContactRelationshipTypeCode, int enrollmentRequestApplicationTS, String enrollmentRequestPlanYear, String enrollmentRequestSourceTypeCode, String enrollmentRequestStatusTypeCode, int enrollmentRequestSubmissionTS, int enrollmentRequestSurrogateKey, String enrollmentRequestTypeCode, int enrollmentRequestVersion, List<FileInformation> fileInformations, String genderTypeCode, int incomePercentOfFederalPL, List<Indicator> indicators, String languageTypeCode, String lineOfBusinessTypeCode, String lisCopayLevelIdentifier, String lisDeterminationSourceTypeCode, String longTermCareFacilityName, String medicaidLevel, String medicareCardholderName, String networkIdentifier, String networkName, String partDPlanBenefitPackageIdentifier, String partDPlanContractorNumber, int partDPremiumAMT, String partDSubsidyDeterminationTypeCode, int premiumAmountPerM, String premiumWithholdSource, String prescriptionCurrentDispositionTypeCode, String primaryCarePhysicianFirstName, String primaryCarePhysicianIdentifier, String primaryCarePhysicianLastName, String sepCmsReasonTypeCode, String sepReasonTypeCode, String spapAppealResultTypeCode, String spapInsuranceTypeCode, String sponsorEnrollmentPortalAgentIdentifier, int subsidyCoveredPCT) {
        super();
        this.enrollmentRequestIdentifier = enrollmentRequestIdentifier;
        this.addresses = addresses;
        this.applicantDOB = applicantDOB;
        this.applicantFirstName = applicantFirstName;
        this.applicantIdentifiers = applicantIdentifiers;
        this.applicantLastName = applicantLastName;
        this.applicantLawfulPresenceStatusTypeCode = applicantLawfulPresenceStatusTypeCode;
        this.applicantMiddleName = applicantMiddleName;
        this.applicantOtherCoverageGroupIdentifier = applicantOtherCoverageGroupIdentifier;
        this.applicantOtherCoverageIdentifier = applicantOtherCoverageIdentifier;
        this.applicantOtherCoverageName = applicantOtherCoverageName;
        this.applicantPrefix = applicantPrefix;
        this.applicantPrescriptionDrugCoverageGroupIdentifier = applicantPrescriptionDrugCoverageGroupIdentifier;
        this.applicantPrescriptionDrugCoverageName = applicantPrescriptionDrugCoverageName;
        this.applicantPrescriptionDrugCoveragePartDBin = applicantPrescriptionDrugCoveragePartDBin;
        this.applicantPrescriptionDrugCoveragePartDProcessorControlNumber = applicantPrescriptionDrugCoveragePartDProcessorControlNumber;
        this.applicantSuffix = applicantSuffix;
        this.applicantWorkStatusTypeCode = applicantWorkStatusTypeCode;
        this.authorizedRepresentativeFirstName = authorizedRepresentativeFirstName;
        this.authorizedRepresentativeLastName = authorizedRepresentativeLastName;
        this.authorizedRepresentativeRelationshipTypeCode = authorizedRepresentativeRelationshipTypeCode;
        this.authorizedRepresentativeTypeCode = authorizedRepresentativeTypeCode;
        this.bankAccountHolderFirstName = bankAccountHolderFirstName;
        this.bankAccountHolderLastName = bankAccountHolderLastName;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountRoutingNumber = bankAccountRoutingNumber;
        this.bankAccountTypeCode = bankAccountTypeCode;
        this.bankName = bankName;
        this.bcrcDocumentControlNumber = bcrcDocumentControlNumber;
        this.benefitPlanIdentifier = benefitPlanIdentifier;
        this.benefitPlanName = benefitPlanName;
        this.benefitPlanSegmentIdentifier = benefitPlanSegmentIdentifier;
        this.contacts = contacts;
        this.contractIdentifier = contractIdentifier;
        this.deemedCopayLevelIdentifier = deemedCopayLevelIdentifier;
        this.deemedEligibleReasonTypeCode = deemedEligibleReasonTypeCode;
        this.documentControlNumber = documentControlNumber;
        this.dualStatusTypeCode = dualStatusTypeCode;
        this.emergencyContactFirstName = emergencyContactFirstName;
        this.emergencyContactLastName = emergencyContactLastName;
        this.emergencyContactRelationshipTypeCode = emergencyContactRelationshipTypeCode;
        this.enrollmentRequestApplicationTS = enrollmentRequestApplicationTS;
        this.enrollmentRequestPlanYear = enrollmentRequestPlanYear;
        this.enrollmentRequestSourceTypeCode = enrollmentRequestSourceTypeCode;
        this.enrollmentRequestStatusTypeCode = enrollmentRequestStatusTypeCode;
        this.enrollmentRequestSubmissionTS = enrollmentRequestSubmissionTS;
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
        this.enrollmentRequestTypeCode = enrollmentRequestTypeCode;
        this.enrollmentRequestVersion = enrollmentRequestVersion;
        this.fileInformations = fileInformations;
        this.genderTypeCode = genderTypeCode;
        this.incomePercentOfFederalPL = incomePercentOfFederalPL;
        this.indicators = indicators;
        this.languageTypeCode = languageTypeCode;
        this.lineOfBusinessTypeCode = lineOfBusinessTypeCode;
        this.lisCopayLevelIdentifier = lisCopayLevelIdentifier;
        this.lisDeterminationSourceTypeCode = lisDeterminationSourceTypeCode;
        this.longTermCareFacilityName = longTermCareFacilityName;
        this.medicaidLevel = medicaidLevel;
        this.medicareCardholderName = medicareCardholderName;
        this.networkIdentifier = networkIdentifier;
        this.networkName = networkName;
        this.partDPlanBenefitPackageIdentifier = partDPlanBenefitPackageIdentifier;
        this.partDPlanContractorNumber = partDPlanContractorNumber;
        this.partDPremiumAMT = partDPremiumAMT;
        this.partDSubsidyDeterminationTypeCode = partDSubsidyDeterminationTypeCode;
        this.premiumAmountPerM = premiumAmountPerM;
        this.premiumWithholdSource = premiumWithholdSource;
        this.prescriptionCurrentDispositionTypeCode = prescriptionCurrentDispositionTypeCode;
        this.primaryCarePhysicianFirstName = primaryCarePhysicianFirstName;
        this.primaryCarePhysicianIdentifier = primaryCarePhysicianIdentifier;
        this.primaryCarePhysicianLastName = primaryCarePhysicianLastName;
        this.sepCmsReasonTypeCode = sepCmsReasonTypeCode;
        this.sepReasonTypeCode = sepReasonTypeCode;
        this.spapAppealResultTypeCode = spapAppealResultTypeCode;
        this.spapInsuranceTypeCode = spapInsuranceTypeCode;
        this.sponsorEnrollmentPortalAgentIdentifier = sponsorEnrollmentPortalAgentIdentifier;
        this.subsidyCoveredPCT = subsidyCoveredPCT;
    }

    public String getEnrollmentRequestIdentifier() {
        return enrollmentRequestIdentifier;
    }

    public void setEnrollmentRequestIdentifier(String enrollmentRequestIdentifier) {
        this.enrollmentRequestIdentifier = enrollmentRequestIdentifier;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getApplicantDOB() {
        return applicantDOB;
    }

    public void setApplicantDOB(int applicantDOB) {
        this.applicantDOB = applicantDOB;
    }

    public String getApplicantFirstName() {
        return applicantFirstName;
    }

    public void setApplicantFirstName(String applicantFirstName) {
        this.applicantFirstName = applicantFirstName;
    }

    public List<ApplicantIdentifier> getApplicantIdentifiers() {
        return applicantIdentifiers;
    }

    public void setApplicantIdentifiers(List<ApplicantIdentifier> applicantIdentifiers) {
        this.applicantIdentifiers = applicantIdentifiers;
    }

    public String getApplicantLastName() {
        return applicantLastName;
    }

    public void setApplicantLastName(String applicantLastName) {
        this.applicantLastName = applicantLastName;
    }

    public String getApplicantLawfulPresenceStatusTypeCode() {
        return applicantLawfulPresenceStatusTypeCode;
    }

    public void setApplicantLawfulPresenceStatusTypeCode(String applicantLawfulPresenceStatusTypeCode) {
        this.applicantLawfulPresenceStatusTypeCode = applicantLawfulPresenceStatusTypeCode;
    }

    public String getApplicantMiddleName() {
        return applicantMiddleName;
    }

    public void setApplicantMiddleName(String applicantMiddleName) {
        this.applicantMiddleName = applicantMiddleName;
    }

    public String getApplicantOtherCoverageGroupIdentifier() {
        return applicantOtherCoverageGroupIdentifier;
    }

    public void setApplicantOtherCoverageGroupIdentifier(String applicantOtherCoverageGroupIdentifier) {
        this.applicantOtherCoverageGroupIdentifier = applicantOtherCoverageGroupIdentifier;
    }

    public String getApplicantOtherCoverageIdentifier() {
        return applicantOtherCoverageIdentifier;
    }

    public void setApplicantOtherCoverageIdentifier(String applicantOtherCoverageIdentifier) {
        this.applicantOtherCoverageIdentifier = applicantOtherCoverageIdentifier;
    }

    public String getApplicantOtherCoverageName() {
        return applicantOtherCoverageName;
    }

    public void setApplicantOtherCoverageName(String applicantOtherCoverageName) {
        this.applicantOtherCoverageName = applicantOtherCoverageName;
    }

    public String getApplicantPrefix() {
        return applicantPrefix;
    }

    public void setApplicantPrefix(String applicantPrefix) {
        this.applicantPrefix = applicantPrefix;
    }

    public String getApplicantPrescriptionDrugCoverageGroupIdentifier() {
        return applicantPrescriptionDrugCoverageGroupIdentifier;
    }

    public void setApplicantPrescriptionDrugCoverageGroupIdentifier(String applicantPrescriptionDrugCoverageGroupIdentifier) {
        this.applicantPrescriptionDrugCoverageGroupIdentifier = applicantPrescriptionDrugCoverageGroupIdentifier;
    }

    public String getApplicantPrescriptionDrugCoverageName() {
        return applicantPrescriptionDrugCoverageName;
    }

    public void setApplicantPrescriptionDrugCoverageName(String applicantPrescriptionDrugCoverageName) {
        this.applicantPrescriptionDrugCoverageName = applicantPrescriptionDrugCoverageName;
    }

    public String getApplicantPrescriptionDrugCoveragePartDBin() {
        return applicantPrescriptionDrugCoveragePartDBin;
    }

    public void setApplicantPrescriptionDrugCoveragePartDBin(String applicantPrescriptionDrugCoveragePartDBin) {
        this.applicantPrescriptionDrugCoveragePartDBin = applicantPrescriptionDrugCoveragePartDBin;
    }

    public String getApplicantPrescriptionDrugCoveragePartDProcessorControlNumber() {
        return applicantPrescriptionDrugCoveragePartDProcessorControlNumber;
    }

    public void setApplicantPrescriptionDrugCoveragePartDProcessorControlNumber(String applicantPrescriptionDrugCoveragePartDProcessorControlNumber) {
        this.applicantPrescriptionDrugCoveragePartDProcessorControlNumber = applicantPrescriptionDrugCoveragePartDProcessorControlNumber;
    }

    public String getApplicantSuffix() {
        return applicantSuffix;
    }

    public void setApplicantSuffix(String applicantSuffix) {
        this.applicantSuffix = applicantSuffix;
    }

    public String getApplicantWorkStatusTypeCode() {
        return applicantWorkStatusTypeCode;
    }

    public void setApplicantWorkStatusTypeCode(String applicantWorkStatusTypeCode) {
        this.applicantWorkStatusTypeCode = applicantWorkStatusTypeCode;
    }

    public String getAuthorizedRepresentativeFirstName() {
        return authorizedRepresentativeFirstName;
    }

    public void setAuthorizedRepresentativeFirstName(String authorizedRepresentativeFirstName) {
        this.authorizedRepresentativeFirstName = authorizedRepresentativeFirstName;
    }

    public String getAuthorizedRepresentativeLastName() {
        return authorizedRepresentativeLastName;
    }

    public void setAuthorizedRepresentativeLastName(String authorizedRepresentativeLastName) {
        this.authorizedRepresentativeLastName = authorizedRepresentativeLastName;
    }

    public String getAuthorizedRepresentativeRelationshipTypeCode() {
        return authorizedRepresentativeRelationshipTypeCode;
    }

    public void setAuthorizedRepresentativeRelationshipTypeCode(String authorizedRepresentativeRelationshipTypeCode) {
        this.authorizedRepresentativeRelationshipTypeCode = authorizedRepresentativeRelationshipTypeCode;
    }

    public String getAuthorizedRepresentativeTypeCode() {
        return authorizedRepresentativeTypeCode;
    }

    public void setAuthorizedRepresentativeTypeCode(String authorizedRepresentativeTypeCode) {
        this.authorizedRepresentativeTypeCode = authorizedRepresentativeTypeCode;
    }

    public String getBankAccountHolderFirstName() {
        return bankAccountHolderFirstName;
    }

    public void setBankAccountHolderFirstName(String bankAccountHolderFirstName) {
        this.bankAccountHolderFirstName = bankAccountHolderFirstName;
    }

    public String getBankAccountHolderLastName() {
        return bankAccountHolderLastName;
    }

    public void setBankAccountHolderLastName(String bankAccountHolderLastName) {
        this.bankAccountHolderLastName = bankAccountHolderLastName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountRoutingNumber() {
        return bankAccountRoutingNumber;
    }

    public void setBankAccountRoutingNumber(String bankAccountRoutingNumber) {
        this.bankAccountRoutingNumber = bankAccountRoutingNumber;
    }

    public String getBankAccountTypeCode() {
        return bankAccountTypeCode;
    }

    public void setBankAccountTypeCode(String bankAccountTypeCode) {
        this.bankAccountTypeCode = bankAccountTypeCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBcrcDocumentControlNumber() {
        return bcrcDocumentControlNumber;
    }

    public void setBcrcDocumentControlNumber(String bcrcDocumentControlNumber) {
        this.bcrcDocumentControlNumber = bcrcDocumentControlNumber;
    }

    public String getBenefitPlanIdentifier() {
        return benefitPlanIdentifier;
    }

    public void setBenefitPlanIdentifier(String benefitPlanIdentifier) {
        this.benefitPlanIdentifier = benefitPlanIdentifier;
    }

    public String getBenefitPlanName() {
        return benefitPlanName;
    }

    public void setBenefitPlanName(String benefitPlanName) {
        this.benefitPlanName = benefitPlanName;
    }

    public String getBenefitPlanSegmentIdentifier() {
        return benefitPlanSegmentIdentifier;
    }

    public void setBenefitPlanSegmentIdentifier(String benefitPlanSegmentIdentifier) {
        this.benefitPlanSegmentIdentifier = benefitPlanSegmentIdentifier;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getContractIdentifier() {
        return contractIdentifier;
    }

    public void setContractIdentifier(String contractIdentifier) {
        this.contractIdentifier = contractIdentifier;
    }

    public String getDeemedCopayLevelIdentifier() {
        return deemedCopayLevelIdentifier;
    }

    public void setDeemedCopayLevelIdentifier(String deemedCopayLevelIdentifier) {
        this.deemedCopayLevelIdentifier = deemedCopayLevelIdentifier;
    }

    public String getDeemedEligibleReasonTypeCode() {
        return deemedEligibleReasonTypeCode;
    }

    public void setDeemedEligibleReasonTypeCode(String deemedEligibleReasonTypeCode) {
        this.deemedEligibleReasonTypeCode = deemedEligibleReasonTypeCode;
    }

    public String getDocumentControlNumber() {
        return documentControlNumber;
    }

    public void setDocumentControlNumber(String documentControlNumber) {
        this.documentControlNumber = documentControlNumber;
    }

    public String getDualStatusTypeCode() {
        return dualStatusTypeCode;
    }

    public void setDualStatusTypeCode(String dualStatusTypeCode) {
        this.dualStatusTypeCode = dualStatusTypeCode;
    }

    public String getEmergencyContactFirstName() {
        return emergencyContactFirstName;
    }

    public void setEmergencyContactFirstName(String emergencyContactFirstName) {
        this.emergencyContactFirstName = emergencyContactFirstName;
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public void setEmergencyContactLastName(String emergencyContactLastName) {
        this.emergencyContactLastName = emergencyContactLastName;
    }

    public String getEmergencyContactRelationshipTypeCode() {
        return emergencyContactRelationshipTypeCode;
    }

    public void setEmergencyContactRelationshipTypeCode(String emergencyContactRelationshipTypeCode) {
        this.emergencyContactRelationshipTypeCode = emergencyContactRelationshipTypeCode;
    }

    public int getEnrollmentRequestApplicationTS() {
        return enrollmentRequestApplicationTS;
    }

    public void setEnrollmentRequestApplicationTS(int enrollmentRequestApplicationTS) {
        this.enrollmentRequestApplicationTS = enrollmentRequestApplicationTS;
    }

    public String getEnrollmentRequestPlanYear() {
        return enrollmentRequestPlanYear;
    }

    public void setEnrollmentRequestPlanYear(String enrollmentRequestPlanYear) {
        this.enrollmentRequestPlanYear = enrollmentRequestPlanYear;
    }

    public String getEnrollmentRequestSourceTypeCode() {
        return enrollmentRequestSourceTypeCode;
    }

    public void setEnrollmentRequestSourceTypeCode(String enrollmentRequestSourceTypeCode) {
        this.enrollmentRequestSourceTypeCode = enrollmentRequestSourceTypeCode;
    }

    public String getEnrollmentRequestStatusTypeCode() {
        return enrollmentRequestStatusTypeCode;
    }

    public void setEnrollmentRequestStatusTypeCode(String enrollmentRequestStatusTypeCode) {
        this.enrollmentRequestStatusTypeCode = enrollmentRequestStatusTypeCode;
    }

    public int getEnrollmentRequestSubmissionTS() {
        return enrollmentRequestSubmissionTS;
    }

    public void setEnrollmentRequestSubmissionTS(int enrollmentRequestSubmissionTS) {
        this.enrollmentRequestSubmissionTS = enrollmentRequestSubmissionTS;
    }

    public int getEnrollmentRequestSurrogateKey() {
        return enrollmentRequestSurrogateKey;
    }

    public void setEnrollmentRequestSurrogateKey(int enrollmentRequestSurrogateKey) {
        this.enrollmentRequestSurrogateKey = enrollmentRequestSurrogateKey;
    }

    public String getEnrollmentRequestTypeCode() {
        return enrollmentRequestTypeCode;
    }

    public void setEnrollmentRequestTypeCode(String enrollmentRequestTypeCode) {
        this.enrollmentRequestTypeCode = enrollmentRequestTypeCode;
    }

    public int getEnrollmentRequestVersion() {
        return enrollmentRequestVersion;
    }

    public void setEnrollmentRequestVersion(int enrollmentRequestVersion) {
        this.enrollmentRequestVersion = enrollmentRequestVersion;
    }

    public List<FileInformation> getFileInformations() {
        return fileInformations;
    }

    public void setFileInformations(List<FileInformation> fileInformations) {
        this.fileInformations = fileInformations;
    }

    public String getGenderTypeCode() {
        return genderTypeCode;
    }

    public void setGenderTypeCode(String genderTypeCode) {
        this.genderTypeCode = genderTypeCode;
    }

    public int getIncomePercentOfFederalPL() {
        return incomePercentOfFederalPL;
    }

    public void setIncomePercentOfFederalPL(int incomePercentOfFederalPL) {
        this.incomePercentOfFederalPL = incomePercentOfFederalPL;
    }

    public List<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Indicator> indicators) {
        this.indicators = indicators;
    }

    public String getLanguageTypeCode() {
        return languageTypeCode;
    }

    public void setLanguageTypeCode(String languageTypeCode) {
        this.languageTypeCode = languageTypeCode;
    }

    public String getLineOfBusinessTypeCode() {
        return lineOfBusinessTypeCode;
    }

    public void setLineOfBusinessTypeCode(String lineOfBusinessTypeCode) {
        this.lineOfBusinessTypeCode = lineOfBusinessTypeCode;
    }

    public String getLisCopayLevelIdentifier() {
        return lisCopayLevelIdentifier;
    }

    public void setLisCopayLevelIdentifier(String lisCopayLevelIdentifier) {
        this.lisCopayLevelIdentifier = lisCopayLevelIdentifier;
    }

    public String getLisDeterminationSourceTypeCode() {
        return lisDeterminationSourceTypeCode;
    }

    public void setLisDeterminationSourceTypeCode(String lisDeterminationSourceTypeCode) {
        this.lisDeterminationSourceTypeCode = lisDeterminationSourceTypeCode;
    }

    public String getLongTermCareFacilityName() {
        return longTermCareFacilityName;
    }

    public void setLongTermCareFacilityName(String longTermCareFacilityName) {
        this.longTermCareFacilityName = longTermCareFacilityName;
    }

    public String getMedicaidLevel() {
        return medicaidLevel;
    }

    public void setMedicaidLevel(String medicaidLevel) {
        this.medicaidLevel = medicaidLevel;
    }

    public String getMedicareCardholderName() {
        return medicareCardholderName;
    }

    public void setMedicareCardholderName(String medicareCardholderName) {
        this.medicareCardholderName = medicareCardholderName;
    }

    public String getNetworkIdentifier() {
        return networkIdentifier;
    }

    public void setNetworkIdentifier(String networkIdentifier) {
        this.networkIdentifier = networkIdentifier;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getPartDPlanBenefitPackageIdentifier() {
        return partDPlanBenefitPackageIdentifier;
    }

    public void setPartDPlanBenefitPackageIdentifier(String partDPlanBenefitPackageIdentifier) {
        this.partDPlanBenefitPackageIdentifier = partDPlanBenefitPackageIdentifier;
    }

    public String getPartDPlanContractorNumber() {
        return partDPlanContractorNumber;
    }

    public void setPartDPlanContractorNumber(String partDPlanContractorNumber) {
        this.partDPlanContractorNumber = partDPlanContractorNumber;
    }

    public int getPartDPremiumAMT() {
        return partDPremiumAMT;
    }

    public void setPartDPremiumAMT(int partDPremiumAMT) {
        this.partDPremiumAMT = partDPremiumAMT;
    }

    public String getPartDSubsidyDeterminationTypeCode() {
        return partDSubsidyDeterminationTypeCode;
    }

    public void setPartDSubsidyDeterminationTypeCode(String partDSubsidyDeterminationTypeCode) {
        this.partDSubsidyDeterminationTypeCode = partDSubsidyDeterminationTypeCode;
    }

    public int getPremiumAmountPerM() {
        return premiumAmountPerM;
    }

    public void setPremiumAmountPerM(int premiumAmountPerM) {
        this.premiumAmountPerM = premiumAmountPerM;
    }

    public String getPremiumWithholdSource() {
        return premiumWithholdSource;
    }

    public void setPremiumWithholdSource(String premiumWithholdSource) {
        this.premiumWithholdSource = premiumWithholdSource;
    }

    public String getPrescriptionCurrentDispositionTypeCode() {
        return prescriptionCurrentDispositionTypeCode;
    }

    public void setPrescriptionCurrentDispositionTypeCode(String prescriptionCurrentDispositionTypeCode) {
        this.prescriptionCurrentDispositionTypeCode = prescriptionCurrentDispositionTypeCode;
    }

    public String getPrimaryCarePhysicianFirstName() {
        return primaryCarePhysicianFirstName;
    }

    public void setPrimaryCarePhysicianFirstName(String primaryCarePhysicianFirstName) {
        this.primaryCarePhysicianFirstName = primaryCarePhysicianFirstName;
    }

    public String getPrimaryCarePhysicianIdentifier() {
        return primaryCarePhysicianIdentifier;
    }

    public void setPrimaryCarePhysicianIdentifier(String primaryCarePhysicianIdentifier) {
        this.primaryCarePhysicianIdentifier = primaryCarePhysicianIdentifier;
    }

    public String getPrimaryCarePhysicianLastName() {
        return primaryCarePhysicianLastName;
    }

    public void setPrimaryCarePhysicianLastName(String primaryCarePhysicianLastName) {
        this.primaryCarePhysicianLastName = primaryCarePhysicianLastName;
    }

    public String getSepCmsReasonTypeCode() {
        return sepCmsReasonTypeCode;
    }

    public void setSepCmsReasonTypeCode(String sepCmsReasonTypeCode) {
        this.sepCmsReasonTypeCode = sepCmsReasonTypeCode;
    }

    public String getSepReasonTypeCode() {
        return sepReasonTypeCode;
    }

    public void setSepReasonTypeCode(String sepReasonTypeCode) {
        this.sepReasonTypeCode = sepReasonTypeCode;
    }

    public String getSpapAppealResultTypeCode() {
        return spapAppealResultTypeCode;
    }

    public void setSpapAppealResultTypeCode(String spapAppealResultTypeCode) {
        this.spapAppealResultTypeCode = spapAppealResultTypeCode;
    }

    public String getSpapInsuranceTypeCode() {
        return spapInsuranceTypeCode;
    }

    public void setSpapInsuranceTypeCode(String spapInsuranceTypeCode) {
        this.spapInsuranceTypeCode = spapInsuranceTypeCode;
    }

    public String getSponsorEnrollmentPortalAgentIdentifier() {
        return sponsorEnrollmentPortalAgentIdentifier;
    }

    public void setSponsorEnrollmentPortalAgentIdentifier(String sponsorEnrollmentPortalAgentIdentifier) {
        this.sponsorEnrollmentPortalAgentIdentifier = sponsorEnrollmentPortalAgentIdentifier;
    }

    public int getSubsidyCoveredPCT() {
        return subsidyCoveredPCT;
    }

    public void setSubsidyCoveredPCT(int subsidyCoveredPCT) {
        this.subsidyCoveredPCT = subsidyCoveredPCT;
    }


}
