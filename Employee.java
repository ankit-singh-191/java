import java.util.*;
class Employee
{
 int empId;
 String empName;
 double empSalary;
 Employee(int empId,String  empName,double empSalary)
{
    this.empId=empId;
    this.empName=empName;
    this.empSalary=empSalary;
 }
 void display()
 {
    System.out.println("Employee Id:"+empId);
    System.out.println("Employee Name:"+empName);
    System.out.println("Employee Salary:"+empSalary);

 }
 public static void main(String args[])
 {
    
    Employee e1=new Employee(101, "Ankit", 60000);
    Employee e2=new Employee(102, "Suryansh", 50000);
    Employee e3=new Employee(103, "Divyansh", 40000);

    e1.display();
    e2.display();
    e3.display();
 }
}