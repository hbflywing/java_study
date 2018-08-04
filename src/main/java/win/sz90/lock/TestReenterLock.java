package win.sz90.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestReenterLock  implements Runnable{

    static int i = 0;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for(int j = 0;j<= 200000;j++){
            lock.lock();
            try {
                i++;
                System.out.println(lock.isHeldByCurrentThread());
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestReenterLock testReenterLock = new TestReenterLock();

        Thread t1 = new Thread(testReenterLock);
        Thread t2 = new Thread(testReenterLock);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
