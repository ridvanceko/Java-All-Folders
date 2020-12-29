package Objects;

import java.time.LocalDate;
import java.util.Random;

public class LoveScore {

    /*
    Create one method will take men name and women name and
    returns the love score between 0 to 100
     */

    public void score(String men, String women) {

        Random random = new Random();
        int score = random.nextInt(101);

        System.out.println(men + " and " + women + "'s love score is " + score + " out of 100");

    }

    //Create a method is called calculator and
    //it will take the year and birth and will return age of the person

    public static int calculator(int yearOfBirth){

        int currentYear = LocalDate.now().getYear();
       return currentYear-yearOfBirth;
    }

    public int calculator(int yearOfBirth, int currentYear) {

        return currentYear-yearOfBirth;
    }


    //Create one method will take one param as age than it will calculate and print the
    //number of months, number of days, number of year of year until 90 years old

    public void lifeCalculator (int age) {
        int year = 90-age;
        int month=year*12;
        int days=year*365;
        System.out.println("Year:" + year + " Month:" + month + " Day:" + days);
    }


    //create the method it will take one parameter a the year and it will return true
    //if the year is leap year else it will return false

//    public boolean leapYear (int year) {
//        boolean isLeapYear = false;
//
//        if(year%4==0) {
//            if(year%100==0) {
//                if(year%400==0) {
//                    isLeapYear=true;
//
//                }else {
//                isLeapYear=false;
//            } else {
//                isLeapYear=true;
//            }else {
//                isLeapYear=false;
//            }
//        }
//        return isLeapYear;
//    }



    public static void main(String[] args) {

        LoveScore test = new LoveScore();

        test.score("Ceko", "Jenna");

       int age = test.calculator(2003);
        System.out.println(age);

        int age1 = test.calculator(2003, 2020);
        System.out.println(age1);

        test.lifeCalculator(29);


//      boolean result =  test.leapYear(1996);
//        System.out.println(result);


    }

}
