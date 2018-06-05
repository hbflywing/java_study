package win.sz90.thread;

import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("这是第二个任务！执行线程名："+Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("第二个任务结束");
    }
}
