import java.util.Scanner;
public class Exam_Result {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your marks");
        int a=input.nextInt();
        if (a>35){
            System.out.println("You've passed the exam");
        }
        else{
            System.out.println("Sorry you've failed");
        }
    }
}
