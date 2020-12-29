package WhileLoop;

public class EvenNumber {

    public static void main(String [] args) {
        int num = 20;

        while(num<=30) {
            if(num%2==0) {
                System.out.println(num);
            }

            num++;   //in debug show it is 31 (ask Umut)
        }
        //if the number is even number print it
    }
}
