package map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("David", "Chicago", 25);
        Employee employee2 = new Employee("Ceko", "Tucson", 29);
        Employee employee3 = new Employee("Miley", "Denver", 7);
        Employee employee4 = new Employee("Biley", "London", 34);


        System.out.println(employee1.getName());
        System.out.println(employee2.getAge());
        System.out.println(employee3.getCity());
        System.out.println(employee4);

        Map<String, Employee> employees = new LinkedHashMap<>();

        employees.put(employee1.getEmloyeeID(), employee1);
        employees.put(employee2.getEmloyeeID(), employee2);
        employees.put(employee3.getEmloyeeID(), employee3);
        employees.put(employee4.getEmloyeeID(), employee4);
    }


    // create one method to print only employee names from map.
    public static void printNames(Map <String, Employee> emp) {
        Collection<Employee> employees = emp.values();

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }


        public static void printEmpNumber (Map<String, Employee> emp){

            Set<String> keys = emp.keySet();
            for (Employee employee : employees) ;
            {
                System.out.println(employee.getName());
            }

        }
    }


    }




///EmployeeTest:
////Create 4 employee object
////Create one map to store the employees with their employeeid
////Print only the names from employee from map
////Print all employee information for employees from map
////Print all the employee numbers from map

