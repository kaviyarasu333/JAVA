import java.util.Scanner;
public class Score_Valuation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Score");
        float Score=input.nextFloat();
        if (Score<50){
            System.out.println("You need to improve your score ");
        }
        else if(Score>=50 && Score <= 70){
            System.out.println("Good job keep improving");
        }
        else if(Score>70){
            System.out.println("Excellent performance!");
        }
    }
}
