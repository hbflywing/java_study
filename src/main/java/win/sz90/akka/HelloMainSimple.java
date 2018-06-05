package win.sz90.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * Created by shawn.zeng on 2018/5/15.
 */
public class HelloMainSimple {
    public static void main(String[] args) {
        Config config = ConfigFactory.load("samplehello.conf");
        ActorSystem system = ActorSystem.create("Hello",config );
        ActorRef a = system.actorOf(Props.create(HelloWorld.class),"helloWorld");
        System.out.println("HelloWorld Actor Path:"+ a.path());
    }
}
