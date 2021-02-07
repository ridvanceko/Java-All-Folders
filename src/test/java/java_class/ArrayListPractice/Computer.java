package ArrayListPractice;

public class Computer {

   String manufacturer;
   String name;
   Integer price;
   Double screenSize;

   public Computer (String manufacturer, String name, Integer price, Double screenSize) {
       this.manufacturer = manufacturer;
       this.name = name;
       this.price = price;
       this.screenSize = screenSize;
   }

 public  String toString() {
     return this.manufacturer + " " + this.name + " " + this.price + " " + this.screenSize;

    }

}
