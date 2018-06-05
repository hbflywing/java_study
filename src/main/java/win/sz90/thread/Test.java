package win.sz90.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Task1());
        executorService.submit(new Task1());
        executorService.submit(new Task1());
        executorService.submit(new Task1());
        executorService.submit(new Task1());
    }
}
