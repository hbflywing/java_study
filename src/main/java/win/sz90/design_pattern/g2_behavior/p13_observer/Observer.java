package win.sz90.design_pattern.g2_behavior.p13_observer;

/**
 * 抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时,观察者的update()方法会被回调
 * Created by shawn.zeng on 2018/3/21.
 */
public interface Observer {
    void update(String message);
}
