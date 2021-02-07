package Array;
import java.util.Arrays;
public class BestBuy {
    public static void main(String[] args) {

        String [] [] brands=new String [3] [3];
        
        brands [0] [0]="Apple";
        brands [0] [1]="Microsoft";
        brands [0] [2]="Google";
        
        brands [1] [0]="Apple";
        brands [1] [1]="Samsung";
        brands [1] [2]="Huawei";
        
        brands [2] [0]="Boss";
        brands [2] [1]="LG";
        brands [1] [1]="Beats";

        double [] [] prices= {{1250.0, 850.9, 590.99}, {1000.99, 899.9, 650}, {359.0, 299.00, 499.99}};


        for (int i = 0; i < brands.length ; i++) {

            String result="";

            for (int j = 0; j < brands[i].length; j++) {

                result+=brands[i][j]+ " ("+prices[i][j]+") ";

            }

            switch (i) {
                case 0:
                    result="Computer --> " + result;
                    break;
                case 1:
                    result="Phone --> " + result;
                    break;
                case 2:
                    result="Speaker --> " + result;
                    break;
            }

            System.out.println(result);
            
        }
        

//        prices [0][0]=1250;
//        prices [0][1]=850.9;
//        prices [0][2]=590.99;
//        
//        prices [1][0]=1000.99;
//        prices [1][1]=899.9;
//        prices [1][2]=650;
//        
//        prices [2][0]=359.0;
//        prices [2][1]=299.00;
//        prices [2][2]=499.99;




    }
}

//Products:
//computer --> Apple, Microsoft, Google
//phone    --> Apple, Samsung, Huawei
//speaker  --> Boss, LG, Beats
//Prices:
//computer --> 1250.0, 850.9, 590.99
//phone    --> 1000.99, 899.9, 650
//speaker --> 359.0, 299.00, 499.99