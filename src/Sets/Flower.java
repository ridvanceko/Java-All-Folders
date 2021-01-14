package Sets;

public class Flower {

    String name;
    String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }


    //ususally we use getter and setter if method is "private"
    public  String getName() {
        return  name;

    }
    public  String getColor() {
        return color;
    }

    public  void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
       return "Name: " + name + " | " + " Color: " + color;
    }

}

//FLOWER
//Create one flower class with following instannce variables name and color
//Create one construcgtor to initialize your instance variables
//Create getters and setters
//Create one toString method to print variable information