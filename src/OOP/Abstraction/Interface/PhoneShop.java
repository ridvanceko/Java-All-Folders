package OOP.Abstraction.Interface;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.scrollDown();
        iphone.takePhoto();
        iphone.play();
     //   System.out.println(Memory.CAPACITY);

        System.out.println( iphone.equals(iphone));

        Samsung samsung = new Samsung();
        samsung.scrollDown();;
        samsung.takePhoto();
        samsung.takePhoto();
        samsung.play();



    }
}
