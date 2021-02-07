package ForLoop;

public class PrintMonths {

    public static void main(String[] args) {
        //TASK:
        //2015 to 2020 print years and months
        //2015
        //1 2 3 4 5..12
        //2016
        //1 2 3 4 5..12


        for (int i=2015; i<=2020; i++) {

            for (int m=1; m<=12; m++) {

                System.out.print(m + " ");
            }
            System.out.println(i + " ");
        }

        //when you start with outer loop first you need to finish the inner loop than
        //you need to come back to the outer loop

    }
}
