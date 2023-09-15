package week6.wrapperAndGenerics;

public class LearningGenericMethods {

    public static void main(String[] args) {
        printData("Hello MacMantra");
        printData(1234);

        LearningGenericMethods obj = new LearningGenericMethods();
        obj.boundedData(50);
    }
    static <E> void printData(E data){
        System.out.println(data);
    }

//    Bounded Generics
    <A extends Number> void boundedData(A data){
        System.out.println(data);
    }
}
