class Policy {
    // initial fields for the Policy class
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    // followed by constructors for the Policy class
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
    }

    // getters for each field - No setters -> object fields are initialized through
    // the constructor
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    // calculating policy price/fees
    // Now getting from PolicyHolder class
    public double calculatePolicyPrice() {
        double baseFee = 600;
        double fiftyPlusFee = 0;
        double smokerFee = 0;
        double bmiFee = 0;

        if (policyHolder.getInsuredAge() > 50) {
            fiftyPlusFee = 75;
        }

        if (policyHolder.getInsuredSmokingStatus().equals("smoker")) {
            smokerFee = 100;
        }

        double bmi = policyHolder.insuredBMI();
        if (bmi > 35) {
            bmiFee = (bmi - 35) * 20;
        }

        return baseFee + fiftyPlusFee + smokerFee + bmiFee;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", providerName='" + providerName + '\'' +
                ", policyHolder=" + policyHolder +
                ", Policy Price=$" + String.format("%.2f", calculatePolicyPrice()) +
                '}';
    }

}

// --------- PART ONE CODE
// public class Policy {
// private String policyNumber;
// private String providerName;
// private String insuredFirstName;
// private String insuredLastName;
// private int insuredAge;
// private String insuredSmokingStatus;
// private int insuredHeightInch;
// private int insuredWeightPound;

// // Giving default values + Coonsrutctor/No-arg
// /*
// * since the smoking status is a String and not a boolean,
// * default value will be "non-smoker"
// */
// public Policy() {
// this.policyNumber = "";
// this.providerName = "";
// this.insuredFirstName = "";
// this.insuredLastName = "";
// this.insuredAge = 0;
// this.insuredSmokingStatus = "non-smoker";
// this.insuredHeightInch = 0;
// this.insuredWeightPound = 0;
// }

// // Constructor + Argumentts
// public Policy(String policyNumber, String providerName, String
// insuredFirstName,
// String insuredLastName, int insuredAge, String insuredSmokingStatus,
// int insuredHeightInch, int insuredWeightPound) {

// this.policyNumber = policyNumber;
// this.providerName = providerName;
// this.insuredFirstName = insuredFirstName;
// this.insuredLastName = insuredLastName;
// this.insuredAge = insuredAge;
// this.insuredSmokingStatus = insuredSmokingStatus;
// this.insuredHeightInch = insuredHeightInch;
// this.insuredWeightPound = insuredWeightPound;

// }

// // establishing getters and setters
// public String getPolicyNumber() {
// return policyNumber;
// }

// public void setPolicyNumber(String policyNumber) {
// this.policyNumber = policyNumber;
// }

// public String getProviderName() {
// return providerName;
// }

// public void setProviderName(String providerName) {
// this.providerName = providerName;
// }

// public String getInsuredFirstName() {
// return insuredFirstName;
// }

// public void setInsuredFirstName(String insuredFirstName) {
// this.insuredFirstName = insuredFirstName;
// }

// public String getInsuredLastName() {
// return insuredLastName;
// }

// public void setInsuredLastName(String insuredLastName) {
// this.insuredLastName = insuredLastName;
// }

// public int getInsuredAge() {
// return insuredAge;
// }

// public void setInsuredAge(int insuredAge) {
// this.insuredAge = insuredAge;
// }

// public String getInsuredSmokingStatus() {
// return insuredSmokingStatus;
// }

// public void setInsuredSmokingStatus(String insuredSmokingStatus) {
// this.insuredSmokingStatus = insuredSmokingStatus;
// }

// public int getInsuredHeightInch() {
// return insuredHeightInch;
// }

// public void setInsuredHeightInch(int insuredHeightInch) {
// this.insuredHeightInch = insuredHeightInch;
// }

// public int getInsuredWeightPound() {
// return insuredWeightPound;
// }

// public void setInsuredWeightPound(int insuredWeightPound) {
// this.insuredWeightPound = insuredWeightPound;
// }

// // Method to calculate BMI
// public double insuredBMI() {
// double bodyMassIndex = (insuredWeightPound * 703.0) / (insuredHeightInch *
// insuredHeightInch);
// return bodyMassIndex; // returning BMI total
// }

// // $600 base
// // 50+ $75
// // smoker $100
// // BMI > 35 = (-35) x 20

// // Method to calculate insurance policy price
// public double calculatePolicyPrice() {
// // giving initial values for fees
// double baseFee = 600;
// double fiftyPlusFee = 0;
// double smokerFee = 0;
// double bmiFee = 0;

// // Additional fee for age over 50
// if (insuredAge > 50) {
// fiftyPlusFee = 75;
// }

// // Additional fee for smokers
// if (insuredSmokingStatus.equals("smoker")) {
// smokerFee = 100;
// }

// // Additional fee for BMI over 35
// double bmi = insuredBMI();
// if (bmi > 35) {
// bmiFee = (bmi - 35) * 20; // bmi fee calculation
// }
// // returning all totoals
// return baseFee + fiftyPlusFee + smokerFee + bmiFee;
// }

// // toString
// @Override
// public String toString() {
// return "Policy{" +
// "policyNumber='" + policyNumber + '\'' +
// ", providerName='" + providerName + '\'' +
// ", policyholderFirstName='" + insuredFirstName + '\'' +
// ", policyholderLastName='" + insuredLastName + '\'' +
// ", policyholderAge=" + insuredAge +
// ", policyholderSmokingStatus='" + insuredSmokingStatus + '\'' +
// ", policyholderHeight=" + insuredHeightInch +
// ", policyholderWeight=" + insuredWeightPound +
// '}';
// }
// }