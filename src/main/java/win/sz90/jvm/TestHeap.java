package win.sz90.jvm;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestHeap implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        TestHeap testHeap = new TestHeap();
        executorService.submit(testHeap);
        executorService.submit(testHeap);
        executorService.submit(testHeap);
        executorService.submit(testHeap);
    }

    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.SECONDS.sleep(1);
                Math.log(10000);
                System.out.println("线程的名字是："+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
