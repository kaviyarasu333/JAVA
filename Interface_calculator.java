import java.util.Scanner;
interface calculator {
    void add(int a,int b);
    void sub(int a,int b);
    void multi(int a,int b);
    void div(int a,int b);
}
class mycalc implements calculator{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    public void multi(int a,int b){
        System.out.println(a*b);
    }
    public void div(int a ,int b){
        if(b==0){
            System.out.println("cannot divide using zero");
        }
        else {
            System.out.println(a / b);
        }
    }
}
public class Interface_calculator {
    public static void main(String[] args){
        calculator calc=new mycalc();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you choice: ");
        int choice =input.nextInt();
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the second number");
        int b=input.nextInt();
        if (choice==1){
            calc.add(a,b);
        } else if (choice==2) {
            calc.sub(a,b);
        } else if (choice==3) {
            calc.multi(a,b);
        } else if (choice==4) {
            calc.div(a,b);
        }
        else {
            System.out.println("invalid choice");
        }
    }
}

