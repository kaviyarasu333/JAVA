import java.util.Scanner;

class invalidageexception extends Exception{
    invalidageexception(String message){
        super(message);
    }
}
class agevalidator{
    void checkage(int age){
        try {
            if (age < 10) {
                throw new invalidageexception("your age is less than 10");
            }
            else if (age>150){
                throw new ArithmeticException("Your age is greater than 150");
            }
            System.out.println("Your age is valid");
        } catch (invalidageexception e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class trycatch{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        agevalidator obj=new agevalidator();
        int age=input.nextInt();
        obj.checkage(age);
    }
}