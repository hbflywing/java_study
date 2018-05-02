package win.sz90.syntax;

/**
 * Created by shawn.zeng on 2018/5/2.
 */
public interface IFoo {
    default void bar(int i){
        System.out.printf("IFoo.bar(int)");
    }
}
