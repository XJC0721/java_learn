package multithread;

/**
 * 通过java创建线程
 */
public class Demo01 {
    public static void main(String[] args) {
        //实例化自己的线程类
        MyThread01 myThread01 = new MyThread01();
        myThread01.start();
    }
}
//通过继承类的方式创建线程
class MyThread01 extends Thread{
    @Override
    public void run(){
        System.out.println("hello thread...");
    }
}
