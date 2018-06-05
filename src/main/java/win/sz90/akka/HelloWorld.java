package win.sz90.akka;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Created by shawn.zeng on 2018/5/15.
 */
public class HelloWorld extends UntypedActor{

    ActorRef greeter;

    @Override
    public void preStart() throws Exception {
        greeter = getContext().actorOf(Props.create(Greeter.class),"greeter");
        System.out.println("Greeter Actor Path:"+greeter.path());
        greeter.tell(Greeter.Msg.GREET,getSelf());
    }

    @Override
    public void onReceive(Object message) {
        if(message == Greeter.Msg.DONE){
            greeter.tell(Greeter.Msg.DONE,getSelf());
            getContext().stop(getSelf());
        }else
            unhandled(message);
    }
}
