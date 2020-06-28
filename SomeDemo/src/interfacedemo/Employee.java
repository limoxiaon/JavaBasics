package interfacedemo;

public class Employee implements Comparable<Employee> {

    private String name;
    private Integer salary;

    public Employee() {
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary-o.salary;
    }
}
