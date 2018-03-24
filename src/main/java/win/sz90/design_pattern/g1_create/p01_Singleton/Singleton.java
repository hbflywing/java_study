package win.sz90.design_pattern.g1_create.p01_Singleton;

/**
 * Created by shawn.zeng on 2018/3/24.
 */
public class Singleton {

    //线程安全的
    private static Singleton ourInstance = new Singleton();

    //通过静态方法返回对象
    public static Singleton getInstance() {
        return ourInstance;
    }
    //限制产生多个对象
    private Singleton() {
    }
}
