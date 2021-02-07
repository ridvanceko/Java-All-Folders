package Constructor;

public class StudentTest {

    public static void main(String[] args) {

        Student ceko = new Student("Ceko");
        System.out.println(ceko.fName);
        ceko.age=29;
        System.out.println(ceko.age);
        System.out.println(ceko.schoolName);

        Student marcus = new Student("Marcus");
        System.out.println(marcus.age);
        System.out.println(marcus.schoolName);

        Student bratt = new Student("Bratt");
        System.out.println(bratt.fName);
        System.out.println(bratt.schoolName);

    }
}
