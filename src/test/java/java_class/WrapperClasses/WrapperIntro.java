package WrapperClasses;

public class WrapperIntro {
    public static void main(String[] args) {

        byte by = 10;
        Byte b = new Byte(by);

        //difference between Primitive and Object is primitive data type does not have Methods
        //System.out.println(b.equals(10));
        System.out.println(b==10);

        Character ch = new Character('d');
        System.out.println(ch);

        System.out.println(Character.isDigit('1'));

        System.out.println(ch.compareTo('z')); //if both char is equals to each other
        //compareTO() method will return 0 otherwise it will return - result.
        char c1 = 'c';

        Boolean bl = new Boolean("true");
        System.out.println(bl);


        Integer number = new Integer(11);
        Integer num = 55;
        Integer num1 =  new Integer(55);
        Long ln = 100l;
        Short sh = 55;
        Float fl = 44f;
        Double db = (double)56;
        Double db1 = 56d;


        System.out.println(num==num1); //false --> since the references are not pointing the same object
        System.out.println(num.equals(num1)); // true --> since num and num1 has the same value

        //if the equals method is coming from the object class it will compare the
        //references are pointing to same object or not
        //if the equals method is coming from the Wrapper class,
        //it will compare the values of the object
    }
}
