package Objects;

public class RemainderOverloading {

    public int remainder(int num) {
        return num%2;

    }

    public long remainder(int num, long divisor) {
        return num%divisor;
    }



    public static void main(String[] args) {
        RemainderOverloading test = new RemainderOverloading();

        System.out.println(test.remainder(11));
    }
}
