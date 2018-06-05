package win.sz90.akka;

import akka.actor.UntypedActor;

/**
 * Created by shawn.zeng on 2018/5/15.
 */
public class Greeter extends UntypedActor{

    public  enum Msg{
        GREET,DONE
    }

    @Override
    public void onReceive(Object message) throws InterruptedException {
        if(message == Msg.GREET){
            System.out.printf("Hello World!");
            Thread.sleep(1000);
            getSender().tell(Msg.DONE,getSelf());
        }else
            unhandled(message);
    }
}
