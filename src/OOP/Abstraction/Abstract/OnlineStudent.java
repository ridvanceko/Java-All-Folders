package OOP.Abstraction.Abstract;

public class OnlineStudent extends Student{
    String id;

    //while we are implementing the abstract method
    // we nee to follow method overridden rules

    public OnlineStudent() {
        super("Online", 25);
        this.id = "12345";
    }

    public void attend() {
        System.out.println("Online student is attending ");
    }
  public void speak() {
      System.out.println("Online student is speaking ");
  }

}
