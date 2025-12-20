import java.util.Scanner;
public class Subject_Marks_Evaluation {
    public static void main(String[] args) {
        int temp=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n=input.nextInt();
        System.out.println("Enter the Marks");
        int[] Marks=new int[n];
        for (int i=0;i<n;i++){
            Marks[i]= input.nextInt();
            temp+=Marks[i];
        }
        if(temp<35){
            System.out.println("Additional classes neede");
        }
        else if (temp>=35){
            System.out.println("you are good to go");
        }
    }
}
