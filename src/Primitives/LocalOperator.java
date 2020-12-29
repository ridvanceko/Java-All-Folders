package Primitives;

public class LocalOperator {
    public  static void main(String [] args) {

        int number = 8;

        boolean result = ++number - --number >= 1 && number-- <10;

        //

        System.out.println(number);
        System.out.println(result);
    }
}
