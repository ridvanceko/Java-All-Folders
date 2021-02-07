package Constructor;

public class Task1Result {


    Task1Office office;   //using as instance variable
    Task1Price pr;
    Task1Triangle triangle;

    public Task1Result(Task1Office office, Task1Price pr) {
        this.office = office;
        this.pr = pr;
    }

    public Task1Result(Task1Triangle triangle, Task1Price pr) {
        this.triangle = triangle;
        this.pr = pr;
    }

    public double calculatePayment() {
        double area = office.getArea();
        double price = pr.getPrice();
        return area * price;
    }

    public double calculateTrianglePayment() {
        double area = triangle.getArea();
        double price = pr.getPrice();
        return area*price;
    }
}
