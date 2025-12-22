import java.util.Scanner;
public class Java_Methods {
    static void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name");
        String Fname=in.nextLine();
        System.out.println("Enter your age");
        int Age=in.nextInt();
        System.out.println("Your name is "+Fname+" Your age is "+Age);
    }
    public static void main(String[] args){
        input();
    }
}