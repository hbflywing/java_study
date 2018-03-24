package win.sz90.design_pattern.g1_create.p05_prototype;

/**
 * 原型模式
 * 原型模式就是讲一个对象作为原型，使用clone()方法来创建新的实例。
 * Created by shawn.zeng on 2018/3/24.
 */
public class Prototype implements Cloneable{

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
       this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        Prototype prototype1 = (Prototype)prototype.clone();
    }
}
