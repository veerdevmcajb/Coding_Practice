package loop_string_usingJava8;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Employee {
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sal);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && sal == employee.sal && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

}

class Example {

    public static void main(String[] args) {

        List<Employee> list = List.of(
                new Employee(101,"natha",10000),
                new Employee(102,"shiv",15000),
                new Employee(103,"veer",20000),
                new Employee(103,"Veer",20000)
        );

       List<String> names=  list.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("names of the employee is : " + names);

        System.out.println("get the employee sal as a double");
        list.stream().map(e->e.getSal()*2).forEach(System.out::println);

        // uppserCase
        list.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);

        // convert  a first letter as capital letter
        System.out.println("=====convert  a first letter as capital letter =====");
         list.stream().map(Employee::getName).map(e->e.substring(0,1).toUpperCase()+ e.substring(1)).forEach(System.out::println);

        // Half of sal
        list.stream().mapToInt(e-> e.getSal()/2).forEach(System.out::println);

        System.out.println("Max sal");
        IntStream maxres  = list.stream().mapToInt(e-> e.getSal());
        System.out.println("Max is "+ maxres);



         // removing duplicates object
        System.out.println("========================");
         list.stream().distinct().forEach(System.out::println);

       List<Integer> li = List.of(1,2,2,3,3,4,5,5,2);
       li.stream().distinct().forEach(System.out::println);

       // list.stream().collect(Collectors.groupingBy(Employee::name))


        // System.out.println("BB".hashCode());



    }
}
