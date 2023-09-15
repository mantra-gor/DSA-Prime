package week6.collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // O(1)
//        Set<Integer> set = new LinkedHashSet<>(); // O(n)
//        Set<Integer> set = new TreeSet<>(); // O(log n)

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
    }
}
