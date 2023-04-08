package multithread;

/**
 * 多线程的优势-增加运行速度
 */
public class Demo07 {
    private static long count = 1000000000l;
    public static void main(String[] args) {
        serial();
        concurrency();
    }

    private static void concurrency() {
        long begin = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            long a = 0l;
            for (int i = 0; i < count; i++) {
                a++;
            }
        });
        Thread t2 = new Thread(()->{
            long b = 0l;
            for (int i = 0; i < count; i++) {
                b++;
            }
        });
        t1.start();//告诉系统要创建线程 参与cpu调度 但是还没有执行完 下面的代码就继续执行了 导致时间显示非常短
        t2.start();
        //等待 join当前调用这个方法的线程等待被调用的线程执行完成
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("并行操作耗时："+ (end-begin) + "ms");
    }

    //串行方式
    private static void serial(){

        long begin = System.currentTimeMillis();//开始时间
        long a = 0l;
        for (int i = 0; i < count; i++) {
            a++;
        }
        long b = 0l;
        for (int i = 0; i < count; i++) {
            b++;
        }
        long end = System.currentTimeMillis();//结束时间
        System.out.println("串行操作耗时："+ (end-begin) + "ms");
    }

}
