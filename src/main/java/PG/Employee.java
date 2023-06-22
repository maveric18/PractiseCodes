package src.main.java.PG;

import java.awt.geom.PathIterator;
import java.util.*;

public class Employee {

    int id;
    String firstName;

    String lastName;
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {

    }



    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(1,"Sachin", "Patil");
        Employee employee2 = new Employee(1,"John", "Doe");
        Employee employee3 = new Employee(1,"ABC", "Xander");

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);


        for (Employee employee : list){
            System.out.println("Before Sort " + employee.lastName + " " + employee.firstName);
        }
        Collections.sort(list, new Comparator<Employee>() {

            //abc< xyz  > abc
            @Override
            public int compare(Employee o1, Employee o2) {
                System.out.println(o1.lastName.compareTo(o2.lastName));
                if (o1.lastName.compareTo(o2.lastName) == 0) {
                    System.out.println(o1.firstName.compareTo(o2.firstName));
                    if (o1.firstName.compareTo(o2.firstName) == -1) {
                        System.out.println("-1");
                        return -1;
                    }else {
                        System.out.println(o1.firstName.compareTo(o2.firstName));
                        return o1.firstName.compareTo(o2.firstName);
                    }
                } else {
                    System.out.println(o1.lastName.compareTo(o2.lastName));
                    return o1.lastName.compareTo(o2.lastName);
                }
            }
        });
        System.out.println("-------------------------------------------");

        for (Employee employee : list){
            System.out.println("After Sort " + employee.lastName + " " + employee.firstName);
        }

    }

}
