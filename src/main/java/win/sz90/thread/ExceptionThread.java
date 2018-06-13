package win.sz90.thread;

public class ExceptionThread implements Runnable{
    @Override
    public void run(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ExceptionThread());
        thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        thread.start();
    }

}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

     

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("handler call");

    }
}
