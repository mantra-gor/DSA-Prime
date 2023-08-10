package week2.strings;

import java.sql.PseudoColumnUsage;

public class StringMethods {
    public static void main(String[] args) {
        String str = "    Mantra Gor    ";
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
//        It trims the white spaces
        System.out.println("Trim: " + str.trim());
        System.out.println("Starts With: "+"Carpet".startsWith("Car"));
        System.out.println("Ends With: "+"Piano".endsWith("ino"));
        System.out.println("Ends With: "+"Piano".equals("Music"));
        System.out.println("charAt: "+"PianoMantra".charAt(5));

//        Value of converts int/float into String
        int age = 25;
        String  str1 = String.valueOf(age);
        System.out.println(str1);

//        Replace in Java Strings
        String sentence = "Java is my favourite language. I use Java in my most projects.";
        System.out.println(sentence.replace("Java","Python"));

        System.out.println("Contains: "+sentence.contains("JavaScript"));
        System.out.println("Sub-String: "+sentence.substring(31,62));
        System.out.println("Sub-String: "+sentence.substring(31));
//       Note: Here beginIndex is inclusive but endingIndex is exclusive

        String[] words = sentence.split(" ");
        for (String word:words){
            System.out.println(word);
        }

        String color = "Orange";
        char[] letters = color.toCharArray();
        for (char letter : letters){
            System.out.println(letter);
        }

        String emptyString = "";
        System.out.println("Is Empty: "+emptyString.isEmpty());
        String blankString = "    ";
        System.out.println("Is Blank: "+blankString.isBlank());


/*
       Note: By using this all string methods we are creating a new
       string because strings are immutable in Java.
*/
    }
}
