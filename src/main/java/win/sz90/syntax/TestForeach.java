package win.sz90.syntax;

import java.util.Arrays;
import java.util.List;

public class TestForeach {
    public static void main(String[] args) {
        List list = Arrays.asList("aaa","BBB","CCC");
        final boolean  flag = false;
        list.forEach((Object a) -> {
            if(a.equals("CCC")){
                System.out.println(flag);
            }
        });
        //flag = true;
        System.out.println(flag);
    }
}
