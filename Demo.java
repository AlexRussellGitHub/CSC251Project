import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {

        try {
            File file = new File("PolicyInformation.txt"); // File object to represent the txt
            Scanner inputFile = new Scanner(file); //scanner/object for reading from file

            ArrayList<Policy> policies = new ArrayList<>(); //array to store Policy objects
            int smokerCount = 0;
            int nonSmokerCount = 0;

            while (inputFile.hasNext()) { // Looping through each line of the file to read
                int policyNumber = Integer.parseInt(inputFile.nextLine());
                String providerName = inputFile.nextLine();
                String firstName = inputFile.nextLine();
                String lastName = inputFile.nextLine();
                int age = Integer.parseInt(inputFile.nextLine());
                String smokingStatus = inputFile.nextLine();
                int height = Integer.parseInt(inputFile.nextLine());
                int weight = Integer.parseInt(inputFile.nextLine());

                // Skip a line nexxt policy
                if (inputFile.hasNext()) {
                    inputFile.nextLine();
                }

                //policy object with read data/infomration
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height,
                        weight);
                policies.add(policy);

                //smoker non-smoker counter
                if (smokingStatus.equals("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }

            //closing scanner/object
            inputFile.close();

            // policy details for loop
            for (int i = 0; i < policies.size(); i++) {
                Policy policy = policies.get(i);
                System.out.println("Policy Number: " + policy.getPolicyNumber());
                System.out.println("Provider Name: " + policy.getProviderName());
                System.out.println("Policyholder's First Name: " + policy.getInsuredFirstName());
                System.out.println("Policyholder's Last Name: " + policy.getInsuredLastName());
                System.out.println("Policyholder's Age: " + policy.getInsuredAge());
                System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policy.getInsuredSmokingStatus());
                System.out.println("Policyholder's Height: " + policy.getInsuredHeightInch() + " inches");
                System.out.println("Policyholder's Weight: " + policy.getInsuredWeightPound() + " pounds");
                System.out.printf("Policyholder's BMI: %.2f\n", policy.insuredBMI());
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