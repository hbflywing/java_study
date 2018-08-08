package win.sz90.inter;

public class MyInterface implements DefaultInterface{
    @Override
    public void sayAge(String age) {
        System.out.println("hello "+age);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface();
        myInterface.sayHello("zengbingbing");
        myInterface.sayAge("1");
    }
}
