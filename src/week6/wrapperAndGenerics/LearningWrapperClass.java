package week6.wrapperAndGenerics;

public class LearningWrapperClass {
    public static void main(String[] args){

        Integer obj1 = new Integer(12);
        Integer obj2 = Integer.valueOf(15);

//        Also pass different datatype value in valueOf
        Integer obj4 = Integer.valueOf("55");

        Boolean bool = Boolean.valueOf("true");

        Integer obj3 = 20; // Autoboxing

        int i = obj1; // Unboxing

        System.out.println(obj2);
        System.out.println(obj4+obj2);
        System.out.println(bool);
    }
}
