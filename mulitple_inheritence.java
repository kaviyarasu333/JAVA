interface readable{
    void read();
}
interface  writable{
    void write();
}
interface showable{
    void show();
}
class file implements readable,writable,showable{
    public void read(){
        System.out.println("file hase been red");
    }
    public void write(){
        System.out.println("file has been wrote");
    }
    public void show(){
        System.out.println("file has been shown");
    }
}
public class mulitple_inheritence{
    public static void main(String[] args){
        file f=new file();
        f.read();
        f.write();
        f.read();
    }
}