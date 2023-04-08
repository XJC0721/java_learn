package multithread;

/**
 * 实现runnable接口的方式创建线程
 * 抢占式调度
 * 在修改代码时不用在意创建线程的代码 只需要修改线程任务中的代码
 */
public class Demo03 {
    public static void main(String[] args) {
        //实例化自定义的runnable 生产皮包任务
        MyRunnable myRunnable1 = new MyRunnable();
        //通过构造方法作为参数传入
        Thread thread = new Thread(myRunnable1);
        //启动线程，真正意义上的创建系统线程，参与cpu调度
        thread.start();

        //同一个runnable
        Thread thread1 = new Thread(myRunnable1);
        thread1.start();

        //定义任务
        MyRunnable02 myRunnable02 = new MyRunnable02();
        //实例化皮鞋的生产线
        Thread thread2 = new Thread(myRunnable02);
        thread2.start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        while(true){
            //定义线程要执行的任务
            System.out.println("生产皮包，金币+1...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyRunnable02 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("生产皮鞋，金币+1...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}