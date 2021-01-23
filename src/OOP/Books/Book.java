package OOP.Books;

public class Book {

    String name;
    int page;
    double price;

    public Book(String name, int page, double price) {
        this.name = name;
        this.page = page;
        this.price = price;
    }

    public static int getPage() {  //with the static we are HIDING

        //without static we are  OVERRIDING

        return 320;
    }

    public void getDetails() {
        System.out.println(name + " book has " + getPage()+ " number of page");
    }
}
