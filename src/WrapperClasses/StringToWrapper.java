package WrapperClasses;

public class StringToWrapper {

    public static void main(String[] args) {

        String num = "12.5";

        Double db = Double.valueOf(num);

        System.out.println(db);

        double d = Double.valueOf("43.3");
        //because of unboxing we can store Wrapper class objects to Primitive data type

        String num1 = "11";
        Integer n = Integer.parseInt(num1);
        //because of the autoboxing we can store Primitive data types to Wrapper class object

        boolean bl = Boolean.parseBoolean("123");
        System.out.println(bl);


        Integer number = null;
        int number1 = number;  //run time error
        // int number2 = null;  //compile time error

        System.out.println(number1);

    }
}
