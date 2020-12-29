package StringExample;

public class StringBasics {

    public static void main (String [] args) {

        String str = "Iphone";

        System.out.println(str);

        String bookName = "Oracle Certified A.G";
        System.out.println(bookName);

        String city = new String("Chicago");
        System.out.println(city);

        String fullName = "David " + "Hunt";
        System.out.println(fullName);

        String fullNameDavid = 5 + 3+ " David " + "Hunt " + 5 + 7;
                             //8 --> arithmetic operator     // int + String --> concatenation
                             //"8 David Hunt" + 5 + 7 (concatenation)  -->"8 David Hunt 57"
        System.out.println(fullNameDavid);


        String str1 = "5" + "7" + 4;
        System.out.println(str1);


        int num = 10;
        int num1 = 5;

        int result = num+num1;

        System.out.println("Result = " + result);



        String number = "1";
        number+="2";  //number = "1" + "2"  1 2

        number+=2;    // --> number="1"+2


        System.out.println(number);


    }
}
