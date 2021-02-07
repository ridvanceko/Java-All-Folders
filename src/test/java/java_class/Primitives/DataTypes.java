package Primitives;

public class DataTypes {
    public static void main(String [] args) {

        byte num=-128;
        // if you give more than capacity of byte value(-128 to 127) it will give an error

        short num1=32_000;
        int num2=2_000_000_000;
        //for long values we need to give 'l' or 'L' at the end of the number
        long num3=4562356438847584L;
        System.out.println(num3);

        float num4=3.4f;
        float num5=4;
        System.out.println(num5);
        double num6=5.93;
        double num7=9;
        System.out.println(num6);
    }
}
