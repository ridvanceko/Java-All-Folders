package Constructor;

public class Bottle {

    double capacity;
    boolean handWash;

    //no-argument constructor
    public Bottle() {
        System.out.println("This is bottle object");

    }
    //argument constructor
    public Bottle(double capacity) {
        this();   // --> this() go and find the argument and will print
        this.capacity = capacity;
    }

    public Bottle(double capacity, boolean handWash) {
          this();
//        this.capacity = capacity;
        this.handWash = handWash;
    }

    public static void main(String[] args) {

//        Bottle bottle = new Bottle();
//        Bottle bottle1 = new Bottle(17);
        Bottle bottle2 = new Bottle(17,true);


    }
}
