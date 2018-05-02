package win.sz90.syntax;

/**
 * Created by shawn.zeng on 2018/5/2.
 */
public class TestDefaultMethod implements IFoo{
    public static void main(String[] args) {
        TestDefaultMethod testDefaultMethod = new TestDefaultMethod();
        testDefaultMethod.bar(100000000L);
        IFoo iFoo = testDefaultMethod;
        iFoo.bar(1000);
    }


    public void bar(long i) {
        System.out.printf("Foo.bar(long)");
    }
}
