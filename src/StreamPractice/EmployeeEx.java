package StreamPractice;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeEx {
    int id;
    String name;
    int age;
    String gender;
    String dept;
    int yearOfJoining;
    double salary;

    public EmployeeEx(int id, String name, int age, String gender, String dept, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name " + name + " sal " + salary +
                " Date of joining " + yearOfJoining;
    }

    public static void main(String[] args) {

        List<EmployeeEx> employeeList = new ArrayList<EmployeeEx>();

        employeeList.add(new EmployeeEx(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new EmployeeEx(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new EmployeeEx(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new EmployeeEx(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new EmployeeEx(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new EmployeeEx(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new EmployeeEx(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new EmployeeEx(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new EmployeeEx(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new EmployeeEx(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new EmployeeEx(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new EmployeeEx(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new EmployeeEx(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new EmployeeEx(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new EmployeeEx(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new EmployeeEx(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

        System.out.println(" 1. How many male and female employees are there in the organization ?\n");
        Map<String, Long> res = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getGender, Collectors.counting()));
        System.out.println(res);

        System.out.println("================================\n");

        System.out.println("2. Print the name of all departments in the organization ?\n");
        employeeList.stream().map(EmployeeEx::getDept).distinct().forEach(e -> System.out.println(e));

        System.out.println("================================\n");

        System.out.println("3. What is the average age of male and female employees ? \n");
//        Map<String ,Double> avg= employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getDept, Collectors.averagingInt(EmployeeEx::getAge)));
//        System.out.println(avg);

        Map<String, Double> avg = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getDept, Collectors.averagingInt(EmployeeEx::getAge)));
        System.out.println(avg);

        System.out.println("================================\n");

        System.out.println("4. Get the details of highest paid employee in the organization ?\n");

        Optional<EmployeeEx> optional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeEx::getSalary)));
        if (optional.isPresent()) {
            EmployeeEx emp = optional.get();
            System.out.println(emp.toString());
        }

        System.out.println("================================\n");

        System.out.println("5. Get the names of all employees who have joined after 2015 ?");
        employeeList.stream().filter(e -> e.yearOfJoining > 2015).forEach(name -> System.out.println(name));

        // employeeList.stream().filter(e->e.yearOfJoining > 2015).forEach(System.out::println);

        System.out.println("================================\n");

        System.out.println("6. Count the number of employees in each department ?\n");
        Map<String, Long> count = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getDept, Collectors.counting()));
        System.out.println(count);

        System.out.println("================================\n");
        System.out.println("7. What is the average salary of each department ?\n");
        Map<String, Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getDept, Collectors.averagingDouble(EmployeeEx::getSalary)));
        System.out.println(avgSal);

        System.out.println("================================\n");

        System.out.println("8. Get the details of youngest male emplo yee in the Development department ?\n");

        Optional<EmployeeEx> optional1 = employeeList.stream().filter(e -> e.gender.equals("Male") && e.dept.equals("Development")).min(Comparator.comparing(EmployeeEx::getAge));
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }

        System.out.println("9. Who has the most working experience in the organization ?\n");

        Optional<EmployeeEx> optional2 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(EmployeeEx::getYearOfJoining)));
        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        }

        System.out.println("10. How many male and female employees are there in the Sales team ?\n");

        Map<String, Long> countMaleFemale = employeeList.stream().filter(e -> e.getDept().equals("Sales")).collect(Collectors.groupingBy(EmployeeEx::getGender, Collectors.counting()));
        System.out.println(countMaleFemale);

        System.out.println("11.  What is the average salary of male and female employees ?\n");
        Map<String, Double> avgSalofMaleFemale = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getGender, Collectors.averagingDouble(EmployeeEx::getSalary)));
        System.out.println(avgSalofMaleFemale);

        System.out.println("12. List down the names of all employees in each department ?");
        Map<String, Map<String, List<EmployeeEx>>> names = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getDept, Collectors.groupingBy(EmployeeEx::getName)));
        System.out.println(names);

        System.out.println("13.  What is the average salary and total salary of the whole organization ?");

        DoubleSummaryStatistics states = employeeList.stream().collect(Collectors.summarizingDouble(EmployeeEx::getSalary));
        double average = states.getAverage();
        double sum = states.getSum();
        double maxSal = states.getMax();
        System.out.println("Average sal is "+ average);
        System.out.println("Total sal is "+ sum);
        System.out.println("Max sal is "+ maxSal);

        System.out.println("14.  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?\n");

       Map<String,List<EmployeeEx>> output = employeeList.stream().collect(Collectors.groupingBy(emp->emp.getAge() <=25 ? "<25" : ">25"));
        System.out.println(output);

        Map<Boolean,List<EmployeeEx>> output1 = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() <=25));
        List<EmployeeEx> youngerEqual25 = output1.get(true);
      List<EmployeeEx> youngerThan25 = output1.get(false);
        System.out.println("Younger Or Equal to 25 "+ youngerEqual25);
        System.out.println("Younger than 25 "+ youngerThan25);

        System.out.println("\n 15.  Who is the oldest employee in the organization?");
//        DoubleSummaryStatistics oldEmp = employeeList.stream().collect(Collectors.summarizingDouble(EmployeeEx::getAge));
//        double max = oldEmp.getMax();
//        System.out.println(max);

      Optional<EmployeeEx>optional3 = employeeList.stream().max(Comparator.comparing(EmployeeEx::getAge));
      if(optional3.isPresent())
        {
        System.out.println(optional3);
        }

     Optional<EmployeeEx>optional4 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(EmployeeEx::getAge)));
        System.out.println(optional4);


        // 3rd height sal
       // employeeList.stream().sorted(Comparator.comparingDouble(EmployeeEx::getSalary)).collect(Collectors.)
        employeeList.stream().sorted(Comparator.comparing(EmployeeEx::getSalary).reversed()).skip(2).limit(1).forEach(System.out::println);

        System.out.println("************************************************");
        //
        Map<String, Optional<EmployeeEx>> collect = employeeList.stream().collect(Collectors.groupingBy(EmployeeEx::getDept, Collectors.maxBy(Comparator.comparing(EmployeeEx::getSalary))));
        System.out.println(collect);



    }
}
