package win.sz90.design_pattern.p03_abstract_factory;

/**
 * Created by shawn.zeng on 2018/3/24.
 */
public class AbstractFactory {
    public void ClientCode(String name){
        Food x = new FactoryForA().get();
        x = new FactoryForB().get();
    }
}
