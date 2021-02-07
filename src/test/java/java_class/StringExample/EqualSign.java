package StringExample;

public class EqualSign {

    public static void main(String [] args) {

        String name1 = "David";
        String name2 = new String ("David");
        String name3 = "David";
        String name4 = name2;
        name2 = name1;  //reassignment
        name1 = name4;  //

        System.out.println(name2 == name1);  //false
        System.out.println(name3 == name4);  //false
        System.out.println(name1 == name3);  //false
        System.out.println(name1 == name4);  //true

        System.out.println(name2.length()==name3.length());

    }
}
