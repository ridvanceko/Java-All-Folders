package StringExample;

public class StringMethodsThree {
    public static void main (String [] args) {

        String brand = "microsoft";

        brand = brand.toUpperCase();

        System.out.println(brand);

        brand = brand.toLowerCase();
        System.out.println(brand);

        System.out.println(brand.startsWith("mic")); // startWith() return data type is Boolean

        boolean result = brand.startsWith("icro");
        System.out.println(result);

        System.out.println(brand.endsWith("soft")); // endsWith() return data type is Boolean
        boolean result2 = brand.endsWith("soft");
        System.out.println(result2);


        boolean result3 = brand.equals("microsoft"); //equals
        System.out.println(result3);

        boolean result4 = brand.equalsIgnoreCase("MICROSOFT"); //equalsIgnoreCase
        System.out.println(result4);












    }
}
