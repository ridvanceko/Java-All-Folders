package Blocks;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(); //50
        System.out.println(emp1.employeeID);
        System.out.println(emp1.department);
        Employee emp2 = new Employee("David", 27, 100000); //100
        System.out.println(emp2.employeeID);
        System.out.println(emp1.companyName);
        Employee emp3 = new Employee(); //50

        System.out.println(Employee.budget);

    }
}
