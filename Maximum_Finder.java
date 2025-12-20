import java.util.Scanner;
public class Maximum_Finder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the second number");
        int b=input.nextInt();
        String result= a>b?"A is greater":"B is greater";
        System.out.println(result);
    }
}
