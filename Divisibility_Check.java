import java.util.Scanner;
public class Divisibility_Check {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int A=input.nextInt();
        if (A%3==0 && A%5==0){
            System.out.println("This number is divisible by 3 and 5");
        }
        else {
            System.out.println("This number is not divisible by 3 and 5");
        }
    }
}
