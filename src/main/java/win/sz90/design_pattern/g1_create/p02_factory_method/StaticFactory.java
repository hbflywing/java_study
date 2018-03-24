package win.sz90.design_pattern.g1_create.p02_factory_method;

/**
 * Created by shawn.zeng on 2018/3/24.
 */
public class StaticFactory {
    private StaticFactory(){}
    public static Food getA(){
        return new A();
    }
    public  static Food getB(){
        return new B();
    }

    public static Food getC(){
        return new C();
    }
}
