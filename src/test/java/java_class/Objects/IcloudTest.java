package Objects;

public class IcloudTest {

    public static void main(String[] args) {

       //2048
        Icloud ic = new Icloud();
        ic.userName = "David";
        ic.familyName = "Hunt";
        ic.store(120);  //1928
        System.out.println(ic.storage);
        System.out.println(ic.familyName);



        Icloud ic1 = new Icloud();
        ic1.userName = "Marcus";
        ic.familyName = "Hunt";
        ic1.store(28);     //2020
        System.out.println(ic1.storage);
        System.out.println(ic1.familyName);

        //we must use "STATIC for 'static' --> int storage = 2048;"
    }
}
