package loop_string_usingJava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee_ex2 {

    int id;
    String name;
    String dept;
    double sal;

    public Employee_ex2(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee_ex2 that = (Employee_ex2) o;
        return id == that.id && Double.compare(sal, that.sal) == 0 && Objects.equals(name, that.name) && Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept, sal);
    }


    public static void main(String[] args) {
        List <Employee_ex2>list = List.of(
                new Employee_ex2(10,"Nilesh","HR",10000),
                new Employee_ex2(20,"Mahen","Finance",20000),
                new Employee_ex2(30,"Chetanya","IT",15000),
                new Employee_ex2(40,"Vijay","HR",50000),
                new Employee_ex2(50,"Akash","IT",80000),
                new Employee_ex2(60,"Akshay","Engineering",80000)
        );


        // Q1.  Print names of all employees.

        list.stream().map(Employee_ex2::getName).forEach(System.out::println);

        //Q2.  Get all employees from "Pune".

        //Q3.  Count total number of employees.

        long count1 = list.stream().count();
        System.out.println(count1);

        //Q4.  Get all employees with salary > 70000.
        list.stream().filter(e->e.getSal()>70000).forEach(System.out::println);

        //Q5.  Print all distinct cities.
       // list.stream().collect(Collectors.groupingBy(Employee_ex2::getId))

        System.out.println("***************************************");
        //Q6.  Get names of all HR employees.
        list.stream().filter(e->e.getDept().equals("HR")).map(e->e.getName()).forEach(System.out::println);

      //Q7.  Check if any employee earns more than 90000.
       boolean res = list.stream().anyMatch(e->e.getSal()>90000);
        System.out.println(res);

        //Q8.  Get employee with the highest salary.
        Optional<Employee_ex2> collect = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee_ex2::getSal)));
        if (collect.isPresent()){
            Employee_ex2 emp = collect.get();
            System.out.println(emp.toString());
        }

        System.out.println("*****************************************");
        //Q9.  Sort employees by name alphabetically.
        list.stream().sorted(Comparator.comparing(Employee_ex2::getName)).forEach(System.out::println);

        //Q10. Get total salary of all employees.
        double sum = list.stream().collect(Collectors.summarizingDouble(Employee_ex2::getSal)).getSum();
        System.out.println("total Salary "+ sum);

        // Q11. Get employees sorted by salary descending.

        list.stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed()).forEach(System.out::println);

        System.out.println("======================================");
        //Q12. Get names of top 3 highest paid employees.
        list.stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed()).limit(3).forEach(System.out::println);

        // Q13. Group employees by department.
        Map<String, Map<String, List<Employee_ex2>>> collect1 = list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.groupingBy(Employee_ex2::getName)));
        System.out.println(collect1);

        System.out.println("***************************************");

        //Q14. Count employees in each department.
        Map<String, Long> countemp = list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.counting()));
        System.out.println(countemp);

        System.out.println("=========================================");
        //Q15. Get average salary of Engineering department.
        double avgSal = list.stream().filter(e->e.getDept().equals("Engineering")).collect(Collectors.averagingDouble(Employee_ex2::getSal));
        System.out.println("Average sal of Engineering dept is : "+ avgSal);

        //Q16. Get employees whose age is between 25 and 35.

        System.out.println("===============================");

        //Q18. Find employee with lowest salary in HR.
        DoubleSummaryStatistics hr = list.stream().filter(e -> e.getDept().equals("HR")).collect(Collectors.summarizingDouble(Employee_ex2::getSal));
        System.out.println("emp with min sal is : "+ hr.getMin());

        //Q19. Get department wise total salary.
        Map<String, Double> collect2 = list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.summingDouble(Employee_ex2::getSal)));
        System.out.println(collect2);

        //Q20. Get list of employees from Mumbai sorted by salary.
    }
}





//        Map<Employee_ex2, Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(count);