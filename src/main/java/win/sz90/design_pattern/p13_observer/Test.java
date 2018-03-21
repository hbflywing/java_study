package win.sz90.design_pattern.p13_observer;

/**
 * 观察者模式
 * Created by shawn.zeng on 2018/3/21.
 */
public class Test {

    public static void main(String args[]){
        WechatServer wechatServer = new WechatServer();
        User u1 = new User("曾兵");
        User u2 = new User("钟立");
        User u3 = new User("毛一超");
        wechatServer.registerObserver(u1);
        wechatServer.registerObserver(u2);
        wechatServer.registerObserver(u3);
        wechatServer.setInfomation("Java是最好的语言");
        wechatServer.notifyObserver();
        wechatServer.removeObserver(u2);
        wechatServer.setInfomation("php是最好的语言");
        wechatServer.notifyObserver();
    }

}
