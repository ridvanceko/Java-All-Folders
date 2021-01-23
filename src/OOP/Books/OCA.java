package OOP.Books;

public class OCA extends Book{

    // once we create the instance variable with the same name and datatype
    // from the parent class, child class can not see the variable
    // from parent class unless we using the SUPER keyword
    //In this case, child class has own variable and parent class has own
    // variable with the same name and same data type.

    String name;
    public OCA() {
        super("BOOK", 380, 20.99 );toString();
        this.name = "OCA";
    }

    public static int getPage() {
        return 380;
    }

    public void getOCABookDetails() {
        System.out.println("OCA Books has " + getPage() + " pages");
    }

    public void getBookDetails() {
        System.out.println("Book is " + super.name);
        System.out.println("Page number is " + super.page);
        System.out.println("Price of the book is " + super.price);
        System.out.println("GetPage() method from super class " + Book.getPage());
        super.getDetails();
    }

    public static void main(String[] args) {
        OCA oca = new OCA();
        System.out.println(oca.name);
        oca.getDetails();
        oca.getOCABookDetails();
        oca.getBookDetails(); // --> it calls the super
    }
}
