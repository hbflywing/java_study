package win.sz90.design_pattern.p13_observer;

/**
 * Created by shawn.zeng on 2018/3/21.
 */
public class User implements Observer {

    private String name;

    private String message;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name+"收到推送消息："+ message);
    }
}
