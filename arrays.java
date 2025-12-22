import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int temp=0;
        int n=input.nextInt();
        ArrayList<Integer> ARR=new ArrayList<>();
        ARR.add(0);
        for (int i=0;i<n;i++){
            ARR.add(input.nextInt());
            temp+=ARR.get(i);
        }
        System.out.println(temp);
    }
}
