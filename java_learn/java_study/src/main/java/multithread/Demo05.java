package multithread;

/**
 * 实现runnable接口的匿名内部类方式创建线程
 */
public class Demo05 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while(true){
                    System.out.println("实现runnable接口的匿名内部类方式创建线程 "+count);
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        //启动线程
        thread.start();
    }
}
