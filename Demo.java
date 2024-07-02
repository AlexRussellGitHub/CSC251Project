
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("PolicyInformation.txt"); // File object to represent the txt
            Scanner inputFile = new Scanner(file); // scanner/object for reading from file

            ArrayList<Policy> policies = new ArrayList<>(); // array to store Policy objects
            int smokerCount = 0;
            int nonSmokerCount = 0;

            while (inputFile.hasNext()) { // Looping through each line of the file to read
                int policyNumber = Integer.parseInt(inputFile.nextLine());
                String providerName = inputFile.nextLine();
                String insuredFirstName = inputFile.nextLine();
                String insuredLastName = inputFile.nextLine();
                int insuredAge = Integer.parseInt(inputFile.nextLine());
                String insuredSmokingStatus = inputFile.nextLine();
                int insuredHeightInch = Integer.parseInt(inputFile.nextLine());
                int insuredWeightPound = Integer.parseInt(inputFile.nextLine());
                // Skip a line nexxt policy
                if (inputFile.hasNext()) {
                    inputFile.nextLine();
                }

                PolicyHolder policyHolder = new PolicyHolder(insuredFirstName, insuredLastName, insuredAge,
                        insuredSmokingStatus, insuredHeightInch, insuredWeightPound);
                Policy policy = new Policy(policyNumber, providerName, policyHolder);
                policies.add(policy);

                // smoker non-smoker counter
                if (insuredSmokingStatus.equals("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }
            // closing scanner/object
            inputFile.close();

            // policy details for loop
            // // NOW PolicyHolder details for loop
            for (Policy policy : policies) {
                PolicyHolder policyHolder = policy.getPolicyHolder();
                System.out.println("Policy Number: " + policy.getPolicyNumber());
                System.out.println("Provider Name: " + policy.getProviderName());
                System.out.println("Policyholder's First Name: " + policyHolder.getInsuredFirstName());
                System.out.println("Policyholder's Last Name: " + policyHolder.getInsuredLastName());
                System.out.println("Policyholder's Age: " + policyHolder.getInsuredAge());
                System.out.println(
                        "Policyholder's Smoking Status (smoker/non-smoker): " + policyHolder.getInsuredSmokingStatus());
                System.out.println("Policyholder's Height: " + policyHolder.getInsuredHeightInch() + " inches");
                System.out.println("Policyholder's Weight: " + policyHolder.getInsuredWeightPound() + " pounds");
                System.out.printf("Policyholder's BMI: %.2f\n", policyHolder.insuredBMI());
                System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
                System.out.println();
            }

            System.out.println("The number of policies with a smoker is: " + smokerCount);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        } catch (IOException ex) {
            System.out.println("Something went wrong reading the file: " + ex.getMessage());
        }
    }
}
