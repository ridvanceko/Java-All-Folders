package Constructor;

public class Task1TestPayment {

    public static void main(String[] args) {

        Task1Office office = new Task1Office(10, 15);
        Task1Price price = new Task1Price(11);
        Task1Result result = new Task1Result(office,price);
        System.out.println("Office rent is: " + "$" + result.calculatePayment());


        //test this application for another office and building
        //office width is 17 and length is 21
        //price for sq 14 using the classes calculate the payment for this new office

       Task1Office office1 = new Task1Office(17, 21);
       Task1Price price1 = new Task1Price(14);
       Task1Result result1 = new Task1Result(office1, price1);
        System.out.println("Second Office rent is: " + "$" +result1.calculatePayment());


        Task1Triangle triangle = new Task1Triangle(10, 7);

        Task1Price price2 = new Task1Price(16);
        Task1Result result2 = new Task1Result(triangle, price2);
        System.out.println("Triangle office rent is: " +  "$" + result2.calculateTrianglePayment());


    }
}
