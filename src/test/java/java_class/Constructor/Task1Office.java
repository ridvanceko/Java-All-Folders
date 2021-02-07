package Constructor;

public class Task1Office {

    double width;      //instance variables
    double length;


    public Task1Office(double width, double length) {  //you can use different name but prevent to confusion we use the same name
        //and differentiate them with this.

        this.width = width;     //'this' is for instance variable
        this.length = length;

    }

    public double getArea() {
        return width*length;
    }

}

//Office class with two instance variables width and length(double)
//1- Create one constructor to set the values for instance variables
//2- Create one method will calculate the area of the office

//Create one class called Price with one instance variable which is price(double)
//1- Create one constructor to initialize the instance variable
//2- Create one method to get the price from Price.

//Create one Result Class to find the payment for the office. Inside the Result class
//create two instance variable for Office and Price.
//1- Create one calculatePayment method to calculate the total payment for the office.

//w=10
//l=15
//150*11= 1650
//price= 11$
