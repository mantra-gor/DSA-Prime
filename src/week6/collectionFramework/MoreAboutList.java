package week6.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MoreAboutList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Kamalam");
        fruits.add("Apple");

        for (int i=0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

//        Or We can so this

        for (String fruit:fruits) {
            System.out.println("for each: "+fruit);
        }

//        Or We can so this

        Iterator<String> fruitIterator = fruits.iterator();
        while(fruitIterator.hasNext()){
            System.out.println("Iterator: " + fruitIterator.next());
        }

//        List Iterator
        Iterator<String> fruitIterator1 = fruits.listIterator();
        while(fruitIterator1.hasNext()){
            System.out.println("List Iterator: " + fruitIterator1.next());
        }

//        Sub-List
        List<String> smallList = fruits.subList(1,3);
        System.out.println("Sub-List: " + smallList);

    }
}
