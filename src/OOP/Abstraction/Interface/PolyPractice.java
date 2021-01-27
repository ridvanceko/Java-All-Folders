package OOP.Abstraction.Interface;

import OOP.Abstraction.Interface.Iphone;
import OOP.Abstraction.Interface.Memory;
import OOP.Abstraction.Interface.Phone;

public class PolyPractice {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
       // Phone.play();
        iphone.play(); // --> it does not given the option directly..
        // play() is coming from the Phone class
        // it is static method
        iphone.scrollDown();
        iphone.takePhoto();
      //  iphone.start();   ??

        //Memory memory = new Iphone();

        Phone phone = new Iphone();
       // phone.takePhoto();
        phone.text();
        phone.play();
       // phone.start();  ??
    }
}
