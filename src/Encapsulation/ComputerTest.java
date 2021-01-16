package Encapsulation;

public class ComputerTest {

    public static void main(String[] args) {

        Computer computer = new Computer("Apple", "Intel", 999);

        System.out.println(computer.getBrand());
        System.out.println(computer.getCPU());
        System.out.println(computer.getPrice());
        //computer.setPrice();   // since we did not create the setter isnide the Computer class
        //it is called immutable class



    }
}
