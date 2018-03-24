package win.sz90.design_pattern.g3_struct.p24_decorator;

/**
 *  给一类对象增加新的功能，装饰方法与具体的内部逻辑无关。
 * Created by shawn.zeng on 2018/3/24.
 */
public class Decorator implements Source{

    private Source source;

    public void decotate1(){
        System.out.println("decorate");
    }

    @Override
    public void method() {
        source.method();
        decotate1();
    }
}
