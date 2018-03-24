package win.sz90.design_pattern.p01_Singleton;

/**
 * 线程不安全的
 * Created by shawn.zeng on 2018/3/24.
 */
public class Singleton1 {
    private  static  Singleton1 singleton1 = null;

    private Singleton1(){

    }

    public static Singleton1 getSingleton1(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
