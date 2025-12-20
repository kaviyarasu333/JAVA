import java.util.Scanner;

public class Range_of_Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the second number");
        int b=input.nextInt();
        for (int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}
