package week2.strings;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Mantra";
        String myName = new String("Mantra");

//        Here myName and name both are not same because
//        memory allocation of this both are not same.

        System.out.println(name == myName);

//        To compare this we will use strName.equals() method
        System.out.println(name.equals(myName));
    }
}
