package win.sz90.design_pattern.p13_observer;

/**
 * 抽象被观察接口
 * Created by shawn.zeng on 2018/3/21.
 */
public interface Observerable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
