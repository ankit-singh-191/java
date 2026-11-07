import java.util.Scanner;
 public class Student
 {
    int rollNo;
    String name;
    String course;

 }
 Studnt(int rollNo, String name, String course)
{
    name= n;
rolNo=r;
course=c;
}
Void display()
{
    System.out.println("Roll No:"+rollNo);
    System.out.println("Name:"+name);
    System.out.println("Course:"+Course);
}
Public static void main(String args[])
{
    Scanner Sc=New Scanner(System.in);
    System.out.println("Enter roll no:");
    int r=Sc.nextInt();
    Sysytem.out.println("Enter name:");
    String n=Sc.nextInt();
    System.out.println("Enter course:");
    String c=Sc.nextInt();
    Student s=new Student(rollNo,name,course);
    s.display();
}