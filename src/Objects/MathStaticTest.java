package Objects;

public class MathStaticTest {
    public static void main(String[] args) {



        int sum = Math.sumNum(1,2,3,4,5,6,7);
        System.out.println(sum);


        //we can use the array for varargs but in array parameter we cannot give
        //the values directly.We should create the array and call the array in the parameter

        Math math = new Math();
        int [] nums = {1,2,3,4,5,6,7};
        System.out.println(math.sum(nums));
        new Math().sum(nums);

    }
}
