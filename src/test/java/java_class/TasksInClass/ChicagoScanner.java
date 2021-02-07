package TasksInClass;

import java.util.Scanner;

public class ChicagoScanner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("City name? ");
        String cityName = input.nextLine();
        //chicago
        //new york

        //everytime --> last char index number= length -1

        int length = cityName.length();
        System.out.println("Last character of city " + cityName.charAt(length-1)); //last char
        System.out.println("First character of city " + cityName.charAt(0)); // first letter
        System.out.println("Length of city " + cityName.length());
        System.out.println("Middle character of city " + cityName.charAt(length/2)); //it will give the middle char
        System.out.println("Index of 'g' " + cityName.indexOf("g")); //5
        System.out.println(cityName.indexOf("c", cityName.indexOf("c")+1));

    }
}