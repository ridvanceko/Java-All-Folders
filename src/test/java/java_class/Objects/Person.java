package Objects;

import java.util.Random;

public class Person {

    String name;
    String address;
    int age;

    //create one method nama generateHours, this method will generate the numbers between
    //0 and 10. this number must be odd number

    public int generateHours(String numberType) {
        Random random = new Random();
        int hours = random.nextInt(11);    //hours is local variable
        switch (numberType) {
            case "odd":
            while(hours%2==0) {
                hours = random.nextInt(11);
            }
            break;
            case "even":
                while(hours%2!=0) {
                    hours = random.nextInt(11);
                }
                break;
        }

        return hours;
    }

    public void study() {
        Random random = new Random();
        int hours = random.nextInt(11);    //hours is local variable so we can use the same name!!!!
       while(hours%2==0) {
           hours = random.nextInt(11);

       }

        System.out.println(name + " is studying. The number of the hours is " + hours);
    }

    public void run() {
        int hours = generateHours("even");
        System.out.println(name + "is running " + hours);
    }

    //to get to name of the julia i have to use get
    public String getName() {
        return name;
    }
    public void averageSleep() {
        int sum = 0;
        for (int i = 0; i <7 ; i++) {
            int hours = generateHours("even");
            sum+=hours;
        }
        int average = sum/7;
        System.out.println("Average sleep hours in one week is " + average);
    }

    public void averageStudy() {
        int sum = 0;
        for (int i = 0; i <30 ; i++) {
            int hours = generateHours("odd");
            sum+=hours;
        }
        int average = sum/30;
        System.out.println("Average study hours in one week is " + average);
    }

    public void sleep () {
        int hours = generateHours("odd");
        System.out.println(name + "is sleeping. The number of sleeping hours is " + hours);
    }


    //for test we can call the main method
    public static void main(String[] args) {
        Person  julia = new Person();
        julia.name="Julia";
        julia.study();    //julia will return here as null because it is instance value
        julia.run();
        julia.averageSleep();
        julia.averageStudy();

    }
}
