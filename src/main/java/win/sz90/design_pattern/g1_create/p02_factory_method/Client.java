package win.sz90.design_pattern.g1_create.p02_factory_method;

/**
 * Created by shawn.zeng on 2018/3/24.
 */
public class Client {
    public void get(String name){
        //客户端代码只需要将相应的参数传入即可得到对象
        //用户不需要了解工厂类内部的逻辑。
        Food x = null;
        if(name.equals("A")){
            x = StaticFactory.getA();
        }else if(name.equals("B")){
            x = StaticFactory.getB();
        }else if(name.equals("C")){
            x = StaticFactory.getC();
        }
    }
}
