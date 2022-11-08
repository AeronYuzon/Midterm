import java.util.Scanner;
public class CollegeList{
    public static void main(String[] args){
    Scanner SC = new Scanner(System.in);
    Person per = new Person();
    Student stu = new Student();
    Employee emp = new Employee();
    Faculty fac = new Faculty();

    System.out.print("Press [E] for Employee, [F] for Faculty, or [S] for Student: ");
    String press = SC.nextLine();

    if (press.equalsIgnoreCase("E")) {
        System.out.println("Type employee's name, contact number, salary, and department.");
        System.out.println("Press Enter after every input.");
        per.setName(SC.nextLine());
        per.setContactNum(SC.nextLine());
        emp.setSalary(SC.nextDouble());
        emp.setDepartment(SC.next());
        System.out.println("-----------------------------");
        System.out.println("Name: " + per.getName());
        System.out.println("Contact Number: " + per.getContactNum());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
    }
    else if (press.equalsIgnoreCase("F")) {
        System.out.println("Type faculty member's name, contact number, salary, department and status.");
        System.out.println("Press Enter after every input.");
        per.setName(SC.nextLine());
        per.setContactNum(SC.nextLine());
        emp.setSalary(SC.nextDouble());
        emp.setDepartment(SC.next());
        System.out.println("Is the faculty member regular?");
        System.out.print("Type [Y] for Yes, Type [N] for No: ");
        press = SC.next();
        String status = fac.status ?  "Regular/Tenured" : "Not a Regular/Tenured";
        String stats = fac.status ? "Not a Regular/Tenured" : "Regular/Tenured";
    if (press.equalsIgnoreCase("Y")) {
        System.out.println("-----------------------------");
        System.out.println("Name: " + per.getName());
        System.out.println("Contact Number: " + per.getContactNum());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Status: " + stats);
    }
    else if (press.equalsIgnoreCase("N")) {
        System.out.println("-----------------------------");
        System.out.println("Name: " + per.getName());
        System.out.println("Contact Number: " + per.getContactNum());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Status: " + status);
    }
    else {
        System.out.println("-----------------------------");
        System.out.println("Name: " + per.getName());
        System.out.println("Contact Number: " + per.getContactNum());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Invalid Status! Type Y or N only!");
        }
    }
    else if (press.equalsIgnoreCase("S")) {
        System.out.println("Type student's name, contact number, program, and year level.");
        System.out.println("Press Enter after every input.");
        per.setName(SC.nextLine());
        per.setContactNum(SC.nextLine());
        stu.setProgram(SC.nextLine());
        stu.setYearLevel(SC.nextInt());
        System.out.println("-----------------------------");
        if (stu.getYearLevel() >= 4){
        System.out.println("Name: " + per.getName());
        System.out.println("Contact Number: " + per.getContactNum());
        System.out.println("Program: " + stu.getProgram());
        System.out.println("Year Level: " + stu.getYearLevel());
    }
    else if (stu.getYearLevel() >= 4 || stu.getYearLevel() <= 0) {
        System.out.println("Name: " + per.getName());
        System.out.println("Contact Number: " + per.getContactNum());
        System.out.println("Program: " + stu.getProgram());
        System.out.println("Invalid Year Level!");
    }
}
    else {
        System.out.println("Invalid Input!");
    }
}
}