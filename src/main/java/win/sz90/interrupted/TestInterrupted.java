package win.sz90.interrupted;

public class TestInterrupted extends Thread{
    @Override
    public void run() {
        while(!isInterrupted()){
            System.out.println("aa");
            yield();
        }
        System.out.println("bb");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new TestInterrupted();
        t1.start();
        sleep(5000);
        t1.interrupt();
    }
}
