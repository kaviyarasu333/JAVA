import java.util.Scanner;
public class Addition{
    static void add(Scanner input){
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the Second number");
        int b=input.nextInt();
        int c=a+b;
        System.out.println("The sum of First number "+a+" and "+b+" is "+c);
    }
    static void main(String[] args){
        Scanner input=new Scanner(System.in);
        add(input);
    }
}
