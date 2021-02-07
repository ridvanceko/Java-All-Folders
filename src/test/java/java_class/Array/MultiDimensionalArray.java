package Array;
import java.util.Arrays;
public class MultiDimensionalArray {

    public static void main(String[] args) {

        // [ [3.7, 2.9, 5.4, 4.8 ], [0,0,0,11], [0,20,0,18.9] ]

        double [] [] prices = new double[3][4];

        prices[0][0] = 3.7;
        prices[0][1] = 2.9;
        prices[0][2] = 5.4;
        prices[0][3] = 4.8;

        prices[2][1] = 20;
        prices[1][3] = 11;
        prices[2][3] = 18.9;


        for (int i = 0; i <prices.length ; i++) {

            for (int j = 0; j < prices[i].length ; j++) {

                System.out.println(prices[i][j]);

            }

        }



    }
}
