package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
   private int id;
   private String name;
   private double salary;
   private String dept;


    public Student(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(salary, student.salary) == 0 && Objects.equals(name, student.name) && Objects.equals(dept, student.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit", 45000.50, "IT");
        Student s2 = new Student(2, "Priya", 52000.75, "HR");
        Student s3 = new Student(3, "Rahul", 61000.00, "Finance");
        Student s4 = new Student(4, "Sneha", 48000.25, "Marketing");
        Student s5 = new Student(5, "Karan", 70000.00, "IT");
        Student s6 = new Student(6, "Neha", 55000.00, "HR");
        Student s7 = new Student(7, "Vikram", 62000.00, "Finance");
        Student s8 = new Student(8, "Anjali", 53000.00, "Marketing");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8));

       // System.out.println(list);




    }
}
