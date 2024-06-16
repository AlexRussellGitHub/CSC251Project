
// import java.util.Scanner;

// public class Project_Alex_Russell {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for input
//         System.out.print("Enter Policy Number: ");
//         String policyNumber = scanner.nextLine();

//         System.out.print("Enter Provider Name: ");
//         String providerName = scanner.nextLine();

//         System.out.print("Enter Policyholder's First Name: ");
//         String insuredFirstName = scanner.nextLine();

//         System.out.print("Enter Insured's Last Name: ");
//         String insuredLastName = scanner.nextLine();

//         System.out.print("Enter Insured's Age: ");
//         int insuredAge = scanner.nextInt();

//         // Must be smoker or non-smoker string
//         System.out.print("Enter Insrude's Smoker Status [smoker or non-smoker]: ");
//         scanner.nextLine();
//         String insuredSmokingStatus = scanner.nextLine();

//         System.out.print("Enter Insured's Height [inches]: ");
//         int insuredHeightInch = scanner.nextInt();

//         System.out.print("Enter Insured's Weight [pounds]: ");
//         int insuredWeightPound = scanner.nextInt();

//         // instance of the Policy classs
//         Policy policy = new Policy(policyNumber, providerName, insuredFirstName, insuredLastName, insuredAge,
//                 insuredSmokingStatus, insuredHeightInch, insuredWeightPound);

//         // output display of policy information based on user inputs and calculations

//         System.out.println("\nPolicy Information:");
//         System.out.println("Policy Number: " + policy.getPolicyNumber());
//         System.out.println("Provider Name: " + policy.getProviderName());
//         System.out.println("Policyholder's Name: " + policy.getInsuredFirstName() + " " + policy.getInsuredLastName());
//         System.out.println("Policyholder's Age: " + policy.getInsuredAge());
//         System.out.println("Policyholder's Smoking Status: " + policy.getInsuredSmokingStatus());
//         System.out.println("Policyholder's Height (inches): " + policy.getInsuredHeightInch());
//         System.out.println("Policyholder's Weight (pounds): " + policy.getInsuredWeightPound());
//         System.out.println("Policyholder's BMI: " + policy.insuredBMI());
//         System.out.println("Policy Price: $" + policy.calculatePolicyPrice());

//         scanner.close();
//     }
// }
