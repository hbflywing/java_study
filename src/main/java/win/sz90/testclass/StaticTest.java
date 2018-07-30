package win.sz90.testclass;

/*
*
1.加载的顺序：先父类的static成员变量 -> 子类的static成员变量 -> 父类的成员变量 -> 父类构造 -> 子类成员变量 -> 子类构造

2.static只会加载一次，所以通俗点讲第一次new的时候，所有的static都先会被全部载入(以后再有new都会忽略)，进行默认初始化。在从上往下进行显示初始化。这里静态代码块和静态成员变量没有先后之分，谁在上，谁就先初始化

3.构造代码块是什么？把所有构造方法中相同的内容抽取出来，定义到构造代码块中，将来在调用构造方法的时候，会去自动调用构造代码块。构造代码快优先于构造方法。
*
*
* */
    public class StaticTest {

        public static int k = 0;
        public static StaticTest t1 = new StaticTest("t1");
        public static StaticTest t2 = new StaticTest("t2");
        public static int i = print("i");
        public static int n = 99;
        public int j = print("j");

        {
            print("构造块");
        }

        static{
            print("静态块");
        }

        public StaticTest(String str) {
            System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
            ++n;
            ++i;
        }

        public static int print(String str) {
            System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
            ++i;
            return ++n;
        }
        public static void main(String[] args) {
            StaticTest t = new StaticTest("init");
        }

    }


