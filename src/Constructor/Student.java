package Constructor;

public class Student {

    String fName;
    String lName;
    int age;
    String schoolName="UofA";


    public Student(String fName, String lName, int age) {         //constructor
        this.fName = fName;
        this.lName = lName;
        this.age = age;


    }

    public Student(String fName, String lName, int age, String schoolName) {         //constructor
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.schoolName = schoolName;

    }
    //i can create Student because of default constructor

public Student (String fName) { this.fName = fName; }



//    public Student() {
//
//    }

    //I want to create one method will give the value for fname

    public void setfName(String newName) { fName = newName;}

    public static void main(String[] args) {
        Student student = new Student("Trump"); //i can create Student because of default constructor
        System.out.println(student.fName); //--> Trump
        student.fName="David";
        System.out.println(student.fName); // David
        student.setfName("Ceko");
        System.out.println(student.fName); //Ceko
        System.out.println(student.schoolName);


    }
}
