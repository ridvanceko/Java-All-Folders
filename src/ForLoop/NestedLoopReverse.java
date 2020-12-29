package ForLoop;

public class NestedLoopReverse {
    public static void main(String[] args) {

        int counter = 25;

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <=5; j++){

                System.out.print(counter + " ");
                counter--; // counter = counter-1

            }

            System.out.println("");
        }


    }

}
