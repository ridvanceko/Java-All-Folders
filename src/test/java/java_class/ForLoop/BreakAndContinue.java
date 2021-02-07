package ForLoop;

public class BreakAndContinue {
    public static void main(String[] args) {
        int k=0;

        for(int i = 1; i <=1000; i = i+1) {
           if(i ==10)
            break;
            {
                k = k + 1;  //k++; both produce same outcome
            }
        }
        System.out.println("k = " + k);
    }
}

