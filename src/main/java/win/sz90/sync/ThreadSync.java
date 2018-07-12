package win.sz90.sync;

public class ThreadSync {


    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Thread1 thread1 = new Thread1(obj1,obj2);
        Thread2 thread2 = new Thread2(obj1,obj2);

        Thread thread3 = new Thread(thread1);
        Thread thread4 = new Thread(thread2);

        thread3.start();
        thread4.start();

    }

}

class Thread1 implements Runnable{

    Object obj1;

    Object obj2;

    public Thread1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            System.out.println("获取第一个资源");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println("获取第二个资源");
                System.out.println("获取到所有资源可以进行工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("工作结束");
            }
        }
    }
}

class Thread2 implements Runnable{

    Object obj1;

    Object obj2;

    public Thread2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj2){
            System.out.println("获取第一个资源");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1){
                System.out.println("获取第二个资源");
                System.out.println("获取到所有资源可以进行工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("工作结束");
            }
        }
    }
}
