package week6.wrapperAndGenerics;

public class LearningGenericClass {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("Tommy", "T01");
        Dog<String, Integer> d2 = new Dog<>("OO7", 1);
        Dog<Integer, Integer> d3 = new Dog<>(007, 2);
        Dog<Integer, String> d4 = new Dog<>(007, "J07");

        System.out.println(d2.getName());

    }
}

class Dog<E, T>{
    E name;
    T id;

    public Dog(E name, T id){
        this.name = name;
        this.id = id;
    }

    public E getName() {
        return name;
    }
}