package Constructor;

public class Phone {

    String name;


    public  Phone(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("This is finalize method ");  //finalize method will be called when we have an object is garbage collected
        System.out.println("finalize method will be called when we have an object is garbage collected");
    }

    public String toString() {
        return "Phone name is " + name;   //Override method?
    }

    public static void main(String[] args) {

        Phone one = new Phone("Samsung");
        Phone two = new Phone("Iphone");
        Phone three=one;
        one=two;

       // System.out.println(one.name);
        //System.out.println(one);   output -- >Phone name is iphone
        System.out.println(one.toString());  //   output -- >Phone name is iphone

        System.out.println(one.equals(two)); //one and two pointing the same object --> "true"
        System.out.println(two.equals(three));  //false
        System.out.println(one == two);  //true
        System.out.println(two == three); //false
        three=null;   //this is garbage
        two=null;
        one=null;
        System.gc();  //for calling garbage collect i have to call "System.gc()" method
    }
}
