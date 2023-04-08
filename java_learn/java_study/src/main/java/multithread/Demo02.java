package multithread;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        MyThread02 myThread02 = new MyThread02();
        myThread02.start();
        while(true){
            System.out.println("main thread ...");
            Thread.sleep(1000);
        }
    }
}
class MyThread02 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("hello thread...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
