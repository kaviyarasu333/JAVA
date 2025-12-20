import java.util.Scanner;
public class Student_info {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name=input.nextLine();
        System.out.println("Enter your Marks");
        int Marks=input.nextInt();
        input.nextLine();
        System.out.println("Enter your Department");
        String Dept=input.nextLine();
        int D=Marks/10;
        System.out.println("Your name is "+Name);
        System.out.println("Your mark is "+D);
        System.out.println("Your Department is "+Dept);
    }
}
