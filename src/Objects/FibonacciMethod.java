package Objects;

public class FibonacciMethod {
    /*
    TASK: create a method will take the parameters as the number of fibonacci num
    than it will print all the fibonacci number matching with given parameter
     */

    public void printFibonacci(int num) {

        int a=0, b=1;

        if(num==1) {
            System.out.println(a);
        } else if(num==2) {
            System.out.println(a);
            System.out.println(b);
        }else if (num>2){
            System.out.println(a);
            System.out.println(b);

            for(int i=2; i<num; i++) {
                int sum=a+b;
                System.out.println(sum);
                a=b;
                b=sum;
            }
        }

    }

    public static void main(String [] args) {
        FibonacciMethod test = new FibonacciMethod();
        test.printFibonacci(5);
    }


}
