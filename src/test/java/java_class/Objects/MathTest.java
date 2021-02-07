package Objects;

public class MathTest {

    public static void main(String[] args) {

        Math execute = new Math();
        execute.square(6);
        execute.square(12);
        execute.square(123);

        System.out.println(execute.sum(10,25));

        int result = execute.sum(11,45);
        System.out.println(result);

        double text = execute.rectangleArea(5.8, 3.2);

        System.out.println(text);

        execute.sum(12,34,56);


        int [] nums = {4,5,6,7,8,9,456,6873,64};
       int sumResult = execute.sum(nums);
        System.out.println(sumResult);

        String str ="Techtorial";
        //char ch=str.charAt(0);
        //System.out.println(ch);
        System.out.println(str.charAt(0));


    }
}
