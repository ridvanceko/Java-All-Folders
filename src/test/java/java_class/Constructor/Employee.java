package Constructor;

public class Employee {

    String name;
    int age;
    String companyAddress;
    String companyName;
    String managerName;

    public Employee() {
        this("Joe", 10);
    }


    public Employee (String name, int age) {
        this(name, age, "22 E Tucson", "Tech", "Ceko");
//        this.name = name;
//        this.age = age;
    }

    public Employee(String name, int age, String companyAddress, String companyName, String managerName) {
        this.name = name;
        this.age = age;
        this.companyAddress= companyAddress;
        this.companyName = companyName;
        this.managerName = managerName;

    }



    public static void main(String[] args) {

        Employee emp1 = new Employee("Miley", 7);
        System.out.println(emp1.companyAddress);

        Employee emp2 = new Employee("Jenna", 36 );
        System.out.println(emp2.companyAddress);

        Employee emp3 = new Employee("Ceko", 29, "8500 E Tucson", "Tech", "Robin" );
        System.out.println(emp3.companyAddress);

        Employee emp4 = new Employee();
        System.out.println(emp4.companyAddress);
        System.out.println(emp4.companyName);
        System.out.println(emp4.name);
    }

}
