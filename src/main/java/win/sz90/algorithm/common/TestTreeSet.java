package win.sz90.algorithm.common;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(50);
        tree.add(20);
        tree.add(4);
        tree.add(100);
        tree.add(55);
        tree.add(1);
        tree.add(99);
        System.out.println(tree.pollLast());
        System.out.println(tree.pollLast());
        System.out.println(tree.pollLast());
        System.out.println(tree.pollLast());
    }
}
