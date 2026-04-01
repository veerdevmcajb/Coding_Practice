package loop_string_usingJava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
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
        System.out.println("01------------------------------------------");
        list.stream().map(Employee_ex2::getName).forEach(System.out::println);
        //Q2.  Get all employees from "Pune".
        System.out.println("02------------------------------------------");

        //Q3.  Count total number of employees.
        System.out.println("03------------------------------------------");
        long count1 = list.stream().count();
        System.out.println(count1);

        //Q4.  Get all employees with salary > 70000.
        System.out.println("04------------------------------------------");
        list.stream().filter(e->e.getSal()>70000).forEach(System.out::println);

        //Q5.  Print all distinct cities.
       // list.stream().collect(Collectors.groupingBy(Employee_ex2::getId))
        System.out.println("05------------------------------------------");

        //Q6.  Get names of all HR employees.
        System.out.println("06------------------------------------------");
        list.stream().filter(e->e.getDept().equals("HR")).map(e->e.getName()).forEach(System.out::println);

      //Q7.  Check if any employee earns more than 90000.
        System.out.println("07------------------------------------------");
       boolean res = list.stream().anyMatch(e->e.getSal()>90000);
        System.out.println(res);

        //Q8.  Get employee with the highest salary.
        System.out.println("08------------------------------------------");
        Optional<Employee_ex2> collect = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee_ex2::getSal)));
        if (collect.isPresent()){
            Employee_ex2 emp = collect.get();
            System.out.println(emp.toString());
        }


        //Q9.  Sort employees by name alphabetically.
        System.out.println("09------------------------------------------");
        list.stream().sorted(Comparator.comparing(Employee_ex2::getName)).forEach(System.out::println);

        //Q10. Get total salary of all employees.
        System.out.println("10------------------------------------------");
        double sum = list.stream().collect(Collectors.summarizingDouble(Employee_ex2::getSal)).getSum();
        System.out.println("total Salary "+ sum);

        // Q11. Get employees sorted by salary descending.
        System.out.println("11------------------------------------------");
        list.stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed()).forEach(System.out::println);


        //Q12. Get names of top 3 highest paid employees.
        System.out.println("12------------------------------------------");
        list.stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed()).limit(3).forEach(System.out::println);

        // Q13. Group employees by department.
        System.out.println("13------------------------------------------");
        Map<String, Map<String, List<Employee_ex2>>> collect1 = list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.groupingBy(Employee_ex2::getName)));
        System.out.println(collect1);



        //Q14. Count employees in each department.
        System.out.println("14------------------------------------------");
        Map<String, Long> countemp = list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.counting()));
        System.out.println(countemp);


        //Q15. Get average salary of Engineering department.
        System.out.println("15------------------------------------------");
        double avgSal = list.stream().filter(e->e.getDept().equals("Engineering")).collect(Collectors.averagingDouble(Employee_ex2::getSal));
        System.out.println("Average sal of Engineering dept is : "+ avgSal);

        //Q16. Get employees whose age is between 25 and 35.

        System.out.println("16------------------------------------------");

        //Q18. Find employee with lowest salary in HR.
        System.out.println("18------------------------------------------");
        DoubleSummaryStatistics hr = list.stream().filter(e -> e.getDept().equals("HR")).collect(Collectors.summarizingDouble(Employee_ex2::getSal));
        System.out.println("emp with min sal is : "+ hr.getMin());

        //Q19. Get department wise total salary.
        System.out.println("19------------------------------------------");
        Map<String, Double> collect2 = list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.summingDouble(Employee_ex2::getSal)));
        System.out.println(collect2);

        //Q20. Get list of employees from Mumbai sorted by salary.
        System.out.println("20------------------------------------------");

        //Q21. Find employees earning above their department average.
        System.out.println("21------------------------------------------");
        Map<String , Double> average= list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept , Collectors.averagingDouble(Employee_ex2::getSal)));
        list.stream().filter(s->s.getSal()>average.get(s.dept)).map(Employee_ex2::getName).forEach(System.out::println);

        //Q22. Get department with highest average salary.
        System.out.println("22------------------------------------------");
        list.stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed()).map(e->e.getDept()).limit(1).forEach(System.out::println);


        //Q23. Get top 2 earners from each department.
        System.out.println("23------------------------------------------");
       Map<String ,List<String>>top2= list.stream().collect(Collectors.groupingBy(Employee_ex2::getDept, Collectors.collectingAndThen(Collectors.toList(),
               inner->inner.stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed())
                       .map(Employee_ex2::getName).limit(2).toList())));
        System.out.println(top2);

       //Q24. Find second highest salary overall.
        System.out.println("24------------------------------------------");
        list.stream().max(Comparator.comparingDouble(Employee_ex2::getSal)).stream().sorted(Comparator.comparingDouble(Employee_ex2::getSal).reversed()).skip(1).limit(1).forEach(System.out::println);

        list.stream().map(e->e.getSal()).sorted((a,b)-> (int) (b-a)).skip(1).limit(1).forEach(System.out::println);

        // Q27. Find department with maximum number of employees.

    }
}





