package win.sz90.threadwait;

import java.util.concurrent.TimeUnit;

public class Testwait implements Runnable{
    public static void main(String[] args) {
        Testwait testwait = new Testwait();
        Thread thread1 = new Thread(testwait,"thread1 ");
        Thread thread2 = new Thread(testwait,"thread2 ");
        thread1.start();
        thread2.start();
    }

    @Override
    public  void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"正在运行");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
