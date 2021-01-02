package Constructor;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car cae3 = car1;
        car1 = null;


        //how many object I have inside this class? --> 2
        //NOTE: If the object have no reference, java will garbage collect those references
        // and remove from the memory

        //how many object is garbage collected? --> 1
    }
}
