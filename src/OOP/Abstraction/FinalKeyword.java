package OOP.Abstraction;

import OOP.Books.Book;

public final class FinalKeyword extends Book {

    final String city = "Chicago";


    public FinalKeyword(String name, int page, double price) {
        super(name, page, price);
    }

    public final void printCity() {
        System.out.println(city);
    }
}
