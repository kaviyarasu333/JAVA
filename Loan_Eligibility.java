import java.util.Scanner;
public class Loan_Eligibility {
    public static void main(String[] args) {
        System.out.println("Enter your Salary");
        Scanner input=new Scanner(System.in);
        int Salary=input.nextInt();
        System.out.println("Enter you age");
        int Age=input.nextInt();
        if (Salary>=20000 || Age<=25) {
            System.out.println("Enter the required loan amount");
            int Loan = input.nextInt();
            if (Loan <= 50000) {
                System.out.println("You are eligible to take loan");
            } else {
                System.out.println("The maximum loan amount is 50000");
            }
        }
        else {
            System.out.println("you are not eligible to take loan");
        }
    }
}
