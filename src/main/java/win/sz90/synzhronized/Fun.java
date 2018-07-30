package win.sz90.synzhronized;

public class Fun implements Runnable {
    static int sum = 0;

    synchronized void increase(){
        sum++;
        System.out.println(Thread.holdsLock(this));
    }

    @Override
    public  void run() {
        for(int i=0;i<10000000;i++){
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Fun fun = new Fun();
        Thread t1 = new Thread(fun);
        Thread t2 = new Thread(fun);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum);
        System.out.println("hello");
    }
}
