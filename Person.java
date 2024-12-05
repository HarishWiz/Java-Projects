import java.util.Scanner;

public class Person {
    String studentName;
    int studentId;
    String grade;

static class Student extends Person {

    Scanner sc = new Scanner(System.in);

    public void setStudentName() {
        System.out.println("Enter Student Name:");
        studentName = sc.next();
    }

    public void setStudentId() {
        System.out.println("Enter Student Id:");
        studentId = sc.nextInt();
    }

    public void setGrade() {
        System.out.println("Enter Student Grade:");
        grade = sc.next();
    }

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
    	Student obj=new Student();

        obj.setStudentName();
        obj.setStudentId();
        obj.setGrade();
        obj.display();
    }
}
}

