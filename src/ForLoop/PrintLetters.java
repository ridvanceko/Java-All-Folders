package ForLoop;

public class PrintLetters {
    public static void main(String[] args) {

        String str = "For loop practice class ";

        //print the numbers between 0 to length of the string
        //print all letters from this string with for loop
        //print only the char with "o"
        /*
        f
        o
        r
        ..
         */

        for (int i=0; i<str.length(); i++){

            if(str.charAt(i)=='o'){
            System.out.println(str.charAt(i));
        }

    }
}}
