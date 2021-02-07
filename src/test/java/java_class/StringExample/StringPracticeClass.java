package StringExample;

public class StringPracticeClass {
    public static void main(String [] args) {

        String day = "Saturday";
        //System.out.println(day.toUpperCase(),charAt(3));

      char result = day.toUpperCase().charAt(2); // --> will work without issue

      String month = " January ";
      month = month.trim().toLowerCase().substring(0,3).replace("n", "N" );
      System.out.println(month);

      String month2 = "February";

      //Note: IndexOf() method returns int value, we cannot assign int value to String
     // month2 = month2.trim().concat(" Method Chaining").indexOf("b");

        //Note: we cannot do method chaining after indexOf() method
        //int index = month2.indexOf("b").trim().concat(" Method Chaining");

      int  index = month2.trim().concat(" Method Chaining").indexOf("b");
      System.out.println(month2);   //Result will be February because String is immutable


         //TASK
        String  str = " Zero to Hero ";

        //str = str.trim().toUpperCase().substring(0,3).replace("Zero", "One");

       int number =  str.replace("Zero", "One").toUpperCase().trim().substring(0,3).length();

        System.out.println(number);

        //TASK
        //change Zero with One
        //make all of them upper case
        //remove spaces
        //get only first three character
        //print length of first three character

    }
}
