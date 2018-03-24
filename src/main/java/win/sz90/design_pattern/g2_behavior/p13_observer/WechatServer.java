package win.sz90.design_pattern.g2_behavior.p13_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn.zeng on 2018/3/21.
 */
public class WechatServer implements Observerable {

    //面向接口编程而不是实现
    private List<Observer> list;

    private String message;

    public WechatServer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!list.isEmpty()){
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        list.stream().forEach(o -> o.update(message));
    }

    public void setInfomation(String s){
        this.message = s;
        System.out.println("微信服务更新消息："+s);
        notifyObserver();
    }
}
