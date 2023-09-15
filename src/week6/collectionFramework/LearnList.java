package week6.collectionFramework;

import java.util.*;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(50);

//        System.out.println(list1);
//        System.out.println("Size: " + list1.size());
//        System.out.println(list1.contains(35));
//
//        list1.remove(3);
//        list1.remove(Integer.valueOf(10));
//        System.out.println(list1);
//
//        System.out.println("\n::::Adding List 1 and List 2::::");
//        list1.addAll(list2);
//        System.out.println(list1);

//        Get Intersection of List 1 and List 2
        //list1.retainAll(list2);
        //System.out.println(list1);

//        Clearing the list
//        list1.clear();
//        System.out.println(list1);

//        System.out.println(list1.get(2));

//        list2.set(0,10);
//        System.out.println(list2);

//        list2.add(2,300);
//        System.out.println(list2);

        System.out.println("Index: " + list1.indexOf(30));


    }
}
