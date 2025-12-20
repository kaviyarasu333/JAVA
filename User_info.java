import java.util.Scanner;
public class User_info {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name");
        String Name=input.nextLine();
        System.out.println("Enter your Age");
        int Age=input.nextInt();
        System.out.println("Your Name is "+Name);
        System.out.println("Your Age is "+Age);
    }
}
