package win.sz90.classloader;


/**
 * Created by shawn.zeng on 2018/5/29.
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(ClassLoaderTest.class.getClassLoader().toString());
        System.out.println("class loader:"+String.class.getClassLoader());
    }
}
