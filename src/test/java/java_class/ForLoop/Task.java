package ForLoop;


public class Task {

    public static void main(String[] args) {

        //write the code which will return the counts of 'a' inside of the given text
        //STEPS
        //1) text is given
        //2) loop through the text
        //3) compare the text characters/symbols with 'a'
        //4)if it is 'a' than increase the counter
        //5) print out the counter

        String str = "applicAtion";                           //We can use Scanner too
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }




}
