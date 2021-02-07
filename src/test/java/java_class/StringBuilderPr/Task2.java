package StringBuilderPr;

public class Task2 {

    // 1) if(ch>48 && ch<=57)
    // 2) if(ch>='0' && ch<='9')
    // 3) if(Character.isDigit(ch))

    //How to convert char to String
    //1) ""+char
    //2) String.valuof(char)
    //How to convert string to int --> Integer.parseInt(string);

    public static int sum(StringBuilder str) {

        int  sum = 0;
        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
               String c = String.valueOf(ch);
               int num = Integer.parseInt(c);
               sum+= num;


            }

        }
        return sum;
    }

    public static void main(String[] args) {

        StringBuilder numbers = new StringBuilder("FG56JF8AE8WRTUJ56758SDFK9SF5");

        // create one method that will return sum of digits from stringbuilder object.
        // this method will take one param as StringBuilder
        System.out.println(sum(numbers));


    }
}
