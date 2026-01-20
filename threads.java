class dem extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Text");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class dem1 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("text 1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class threads{
    public static void main(String[] args) {
        dem d= new dem();
        d.start();
        dem1 d1=new dem1();
        d1.start();
    }
}