package win.sz90.inter;

public interface DefaultInterface {
    default void sayHello(String name){
        System.out.println("default say hello "+name);
    }
    void sayAge(String age);
}
