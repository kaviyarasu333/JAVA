abstract class jav{
    abstract void lang();
    void pro(){
        System.out.println("it is a programming language");
    }
}
class program extends jav{
    void lang(){
        System.out.println("it is a programming language too");
    }
}
public class Abstract{
    public static void main(String[] args){
        program p=new program();
        p.lang();
        p.pro();
    }
}