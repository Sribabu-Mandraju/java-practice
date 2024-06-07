import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    String name;
    int id;
    double salary;
    int yearOfJoin;

    void deatils(){
        System.out.println("Name = "+name);
        System.out.println("ID =  "+id);
        System.out.println("Salary = "+salary);
        System.out.println("Year of Joined = "+yearOfJoin);
    }

    void calculateSalary(){
        double newSalary = 0.0;
        int experience = 2024-yearOfJoin;
        if(experience >= 8)
             newSalary = salary + salary*0.20;
        else if(experience >= 4)
            newSalary = salary + salary*0.10;
        else if(experience >= 2)
            newSalary = salary + salary*0.05;
        salary = newSalary;    
    }
   
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Employees");
        n = in.nextInt();

        Employee emp[] = new Employee[n];

        for(int i=0; i<n; i++){
            System.out.printf("Enter the details of Employee %d\n", i+1);
            emp[i] = new Employee();
            System.out.println("Please enter your name: ");
            emp[i].name = in.next();
            System.out.println("Enter your ID: ");
            emp[i].id = in.nextInt();
            System.out.println("Enter your salary: ");
            emp[i].salary = in.nextFloat();
            System.out.println("Enter the year of Joining: ");
            emp[i].yearOfJoin = in.nextInt();
            System.out.println();
        }

        
        emp[0].calculateSalary();
        emp[0].deatils();

        // display all the data
        for(int i=0; i<n;i++){
            emp[i].deatils();
            System.out.println();
        }

    }    
}
