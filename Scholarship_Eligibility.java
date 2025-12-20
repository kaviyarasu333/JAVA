import java.util.Scanner;
public class Scholarship_Eligibility {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you monthly income");
        int Income=input.nextInt();
        if (Income>=7000){
            System.out.println("You are eligible for scholarship");
        }
        else{
            System.out.println("Sorry you are not eligible for scholarship");
        }
    }
}
