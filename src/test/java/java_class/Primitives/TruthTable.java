package Primitives;

public class TruthTable {

    public static void main(String [] args){

        // AND --> &&
        // OR --> ||

        //gpa=3.6 --> gpa should be more than 3.6 or
        // gre score should be more than 560

        double gpa = 3.5;
        int greScore = 570;

        boolean result = gpa>3.6 || greScore>560;

        System.out.println("Can I register to the university: " + result);


        /*TASK: to able to buy a house I need to have at least $300000 or I need to have mortgage
        or creditScore more than equals to 680
       */

        int buyHouse= 300000;
        int creditScore = 680;
        boolean mortgage = true;

        boolean getHouse = creditScore>=680 || mortgage ;

        System.out.println("Can i get a house : " + getHouse);
     }
}
