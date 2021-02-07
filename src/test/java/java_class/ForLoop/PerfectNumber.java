package ForLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 16;  //500
        int sum = 1;

        for (int num=2; num<number; num++) {     //num<=number/2
            if(number%num==0) {
                sum+=num;
            }                             //ask Umut
        }


        if(sum==number){
            System.out.println("it is perfect number ");
        } else{
            System.out.println("it is NOT perfect number ");
        }

    }
}
