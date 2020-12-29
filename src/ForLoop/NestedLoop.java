package ForLoop;

public class NestedLoop {
    public static void main(String[] args) {

for (int i=2015; i<=2020; i++) {
    System.out.println(i);

    for (char ch='b'; ch<='d';ch++) {
        System.out.print(i + " ");
        System.out.println(ch);
    }
}

        //when you start with outer loop first you need to finish the inner loop than
        //you need to come back to the outer loop

    }
}
