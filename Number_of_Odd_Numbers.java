import java.util.Scanner;

public class Number_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int temp=0;
        int a=input.nextInt();
        for (int i=1;i<=a;i+=2){
            temp+=1;
        }
        System.out.println(temp);
    }
}
