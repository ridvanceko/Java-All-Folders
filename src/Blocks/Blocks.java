package Blocks;

public class Blocks {


    static  {
        System.out.println("Static Block");
    }
    
    {
        System.out.println("Instance Block");
    }

    public Blocks() {
        System.out.println("No Argument");
    }

    public static void main(String[] args) {
        Blocks blocks1 = new Blocks();
        Blocks blocks2 = new Blocks();
        Blocks blocks3 = new Blocks();
    }
}
