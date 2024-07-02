class PolicyHolder {
    // initial fields for the Policy class
    private String insuredFirstName;
    private String insuredLastName;
    private int insuredAge;
    private String insuredSmokingStatus;
    private int insuredHeightInch;
    private int insuredWeightPound;

    // followed by constructors for the Policy class
    public PolicyHolder(String insuredFirstName, String insuredLastName, int insuredAge, String insuredSmokingStatus,
            int insuredHeightInch, int insuredWeightPound) {
        this.insuredFirstName = insuredFirstName;
        this.insuredLastName = insuredLastName;
        this.insuredAge = insuredAge;
        this.insuredSmokingStatus = insuredSmokingStatus;
        this.insuredHeightInch = insuredHeightInch;
        this.insuredWeightPound = insuredWeightPound;
    }

    // getters for each field - No setters -> object fields are initialized through
    // the constructor
    public String getInsuredFirstName() {
        return insuredFirstName;
    }

    public String getInsuredLastName() {
        return insuredLastName;
    }

    public int getInsuredAge() {
        return insuredAge;
    }

    public String getInsuredSmokingStatus() {
        return insuredSmokingStatus;
    }

    public int getInsuredHeightInch() {
        return insuredHeightInch;
    }

    public int getInsuredWeightPound() {
        return insuredWeightPound;
    }

    //calculating BMI
    public double insuredBMI() {
        return (insuredWeightPound * 703.0) / (insuredHeightInch * insuredHeightInch);
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "insuredFirstName='" + insuredFirstName + '\'' +
                ", insuredLastName='" + insuredLastName + '\'' +
                ", insuredAge=" + insuredAge +
                ", insuredSmokingStatus='" + insuredSmokingStatus + '\'' +
                ", insuredHeightInch=" + insuredHeightInch +
                ", insuredWeightPound=" + insuredWeightPound +
                ", BMI=" + String.format("%.2f", insuredBMI()) +
                '}';
    }
}
