import java.util.Scanner;
public class Number_Operations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=input.nextInt();
        System.out.println("Enter the second Number");
        int b=input.nextInt();
        System.out.println("Enter the third Number");
        int c=input.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println(d/e);
    }
}
