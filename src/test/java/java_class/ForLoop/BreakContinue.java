package ForLoop;

public class BreakContinue {
    public static void main(String[] args) {

        int counter = 1;

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <=5; j++){

                System.out.print(counter + " ");
                counter++;
                if(j == 3)
              //  continue;
                    break;

            }

            System.out.println("");
        }


    }
}
