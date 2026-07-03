import java.util.ArrayList;
import java.util.Scanner;

   // Abstract Class
abstract class Staff {

    String name;
    int staffID;
    String department;

      // Constructor
    Staff(String name, int staffID, String department) {
         this.name = name;
         this.staffID = staffID;
         this.department = department;
    }

    // Abstract Method
    abstract double calculateSalary();

    // Display Method
    void displayDetails() {
         System.out.println("Name: " + name);
         System.out.println("Staff ID: " + staffID);
         System.out.println("Department: " + department);
    }
}

// Permanent Staff Class
class PermanentStaff extends Staff {

    double basicSalary;
    double allowance;

    PermanentStaff(String name, int staffID, String department,
                   double basicSalary, double allowance) {

        super(name, staffID, department);

        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance;
    }

    @Override
    void displayDetails() {
        super.displayDetails();

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + calculateSalary());

        System.out.println("-------------------------");
    }
}

// Temporary Staff Class
class TemporaryStaff extends Staff {

    double dailyWage;
    int workingDays;

    TemporaryStaff(String name, int staffID, String department,
                   double dailyWage, int workingDays) {

        super(name, staffID, department);

        this.dailyWage = dailyWage;
        this.workingDays = workingDays;
    }

    @Override
    double calculateSalary() {
        return dailyWage * workingDays;
    }

    @Override
    void displayDetails() {
        super.displayDetails();

        System.out.println("Daily Wage: " + dailyWage);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Total Salary: " + calculateSalary());

        System.out.println("-------------------------");
    }
}

// University Class
class University {

    ArrayList<Staff> staffList  =  new ArrayList<>();

    // Add Staff
    void addStaff(Staff s) {
        staffList.add(s);
    }

    // Display Staff Details
    void displayAllStaff() {

        for(Staff F : staffList) {
            F.displayDetails();
        }
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        University u = new University();

        // Predefined Objects

        PermanentStaff p1 =
                new PermanentStaff("Kamal", 101,
                        "IT", 80000, 10000);

        PermanentStaff p2 =
                new PermanentStaff("Nimal", 102,
                        "Maths", 75000, 8000);

        TemporaryStaff t1 =
                new TemporaryStaff("Sunil", 201,
                        "Physics", 3000, 20);

        TemporaryStaff t2 =
                new TemporaryStaff("Saman", 202,
                        "Chemistry", 2500, 18);

        // Add to University
        u.addStaff(p1);
        u.addStaff(p2);
        u.addStaff(t1);
        u.addStaff(t2);

        // User Input for Permanent Staff

        System.out.println("Enter Permanent Staff Details");

        System.out.print("Name: ");
        String pname = sc.next();

        System.out.print("Staff ID: ");
        int pid = sc.nextInt();

        System.out.print("Department: ");
        String pdept = sc.next();

        System.out.print("Basic Salary: ");
        double bs = sc.nextDouble();

        System.out.print("Allowance: ");
        double al = sc.nextDouble();

        PermanentStaff p3 =
                new PermanentStaff(pname, pid,
                        pdept, bs, al);

        u.addStaff(p3);

        // User Input for Temporary Staff

        System.out.println("\nEnter Temporary Staff Details");

        System.out.print("Name: ");
        String tname = sc.next();

        System.out.print("Staff ID: ");
        int tid = sc.nextInt();

        System.out.print("Department: ");
        String tdept = sc.next();

        System.out.print("Daily Wage: ");
        double dw = sc.nextDouble();

        System.out.print("Working Days: ");
        int wd = sc.nextInt();

        TemporaryStaff t3 =
                new TemporaryStaff(tname, tid,
                        tdept, dw, wd);

        u.addStaff(t3);

        // Display All Staff

        System.out.println("\n===== Staff Details =====");

        u.displayAllStaff();

        sc.close();
    }
} 