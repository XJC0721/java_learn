package multithread;

/**
 * 通过Thread匿名内部类的方式创建线程
 */
public class Demo04 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("通过Thread匿名内部类的方式创建线程");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //启动线程
        thread.start();
    }
}
