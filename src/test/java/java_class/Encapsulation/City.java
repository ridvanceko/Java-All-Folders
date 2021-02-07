package Encapsulation;

public class City {

    private String name;
    private long population;
    private String state;
    private String date;


    // GETTER -> it does not take any parameter
    //it will return the value from instance variable
    //Method naming convention for getters is starting with 'get'
    //All getters and setter has public access modifier

    public String getName() {
        return name;
    }

    public long  getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }



}
