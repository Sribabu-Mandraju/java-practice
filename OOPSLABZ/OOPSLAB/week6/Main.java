package week6;

/*
 * 3. Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and 'department' respectively. Now,
assign name, age, phone number, address and salary to an employee and a manager by
making an object of both of these classes and print the same.

 */

class Member{
    String name;
    int age;
    String phNo;
    String address;
    int salary;

    Member(String name, int age, String phNo, String address, int salary){
        this.name = name;
        this.age = age;
        this.phNo = phNo;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member{

    String deparment;

    Employee(String name, int age, String phNo, String address, int salary, String deparment){
        super(name, age, phNo, address, salary);
        this.deparment = deparment;
    }

}
class Manager extends Member{
    String specialization;

    Manager(String name, int age, String phNo, String address, int salary, String specilization){
        super(name, age, phNo, address, salary);
        this.specialization = specilization;
    }

}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Madhuri", 24, "867283274", "Parvathipuram", 50000, "Software Development");
        Manager manag = new Manager("Rakesh", 23, "986472364", "Vangara", 80000, "Sofware");

        // employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phNo);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.deparment);

        // manager
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manag.name);
        System.out.println("Age: " + manag.age);
        System.out.println("Phone Number: " + manag.specialization);
        System.out.println("Address: " + manag.address);
        manag.printSalary();
        
    }
}