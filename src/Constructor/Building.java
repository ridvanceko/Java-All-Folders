package Constructor;

public class Building {

    String name;
    String address;
    int floor;

    public Building (String name) {
        this.name=name;                //reason using 'this' seperate the same names (refers to variable)

    }
    public Building(String name, String address, int floor) {
        this.name = name;
        this.address = address;
        this.floor = floor;
    }

public void  printInfo() {
    System.out.println("Name: " +name+", Address: "+address+" , Floor Number: "+ floor);
}


}
