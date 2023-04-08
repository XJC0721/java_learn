package multithread;

/**
 * 通过lambda表达式的方式创建线程
 */
public class Demo06 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            int count = 0;
            while(true){
                count++;
                System.out.println("通过lambda表达式创建线程 "+count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
