package OOP.Abstraction.Abstract;

public class ClassRoom {

    public static void main(String[] args) {

        //Student student = new Student("David", 34);
        //we cannot instantiate the Student object

        OnCampusStudents oncampus = new OnCampusStudents();
        System.out.println(oncampus.name);
        System.out.println(oncampus.city);

        OnlineStudent online = new OnlineStudent();
        System.out.println(online.name);
       // System.out.println(online.city);
        //city is not available inside onlinestudent class
        // and inside the parent class which is Student
        System.out.println(online.id);
    }
}
