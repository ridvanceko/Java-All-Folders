package Constructor;

public class Computer {

    String name;

    public Computer (String name) {

        this.name = name;

    }
    public boolean equals(Computer c) {
        return this.name.equals(c.name);
    }

    public static void main(String[] args) {
        Computer comp = new Computer("Macbook");
        Computer comp1 = new Computer("Macbook");  //--> other brand will return FALSE

        System.out.println(comp.name);
        System.out.println(comp == comp1);  //--> false
        System.out.println(comp.equals(comp1));  // --> true
    }

}


//// TASK:
//Create one Computer class with instance variables of the name.
//Create one constructor with one argument
//Create equals method that checks the name of both object. If the name is equals it will return true otherwise it will return false.