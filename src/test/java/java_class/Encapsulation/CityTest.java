package Encapsulation;

public class CityTest {
    public static void main(String[] args) {

        City city = new City();
        city.setName("Chicago");
      //  city.getPopulation(5000000);

        System.out.println(city.getName()); //will return null
        System.out.println(city.getPopulation());

    }
}
