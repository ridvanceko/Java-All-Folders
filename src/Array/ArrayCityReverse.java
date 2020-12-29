package Array;
import java.util.Arrays;
public class ArrayCityReverse {
    public static void main(String[] args) {

        String[] cityNames = {"Chicago", "Denver", "Miami", "Tucson", "Scottsdale"};



        for (int i = 0; i<cityNames.length; i++) {
           // System.out.println(cityNames[i]);
           // for (int j = cityNames.length() - 1; j >= 0; j--) {
            String reverse = "";

            for(int j = cityNames[i].length()-1; j>=0; j-- ) {
                reverse+=cityNames[i].charAt(j);
            }
            System.out.println(reverse);
            }

        }
    }

