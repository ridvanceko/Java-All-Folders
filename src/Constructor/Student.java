package Constructor;

public class Student {

    String fName;
    String lName;
    int age;



    public Student() {

    }

    //I want to create one method will give the value for fname

    public void setfName(String newName) {
        fName = newName;
    }

    public static void main(String[] args) {
        Student student = new Student(); //i can create Student because of default constructor
        student.fName="David";
        System.out.println(student.fName);
        student.setfName("Ceko");
        System.out.println(student.fName);


    }
}
