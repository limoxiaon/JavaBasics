package clonedemo;

import java.util.Date;

//深拷贝
public class Employee implements Cloneable{
    private String name;
    private Integer salary;
    private Date date;

    public Employee() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, Integer salary, Date date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
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
    protected Employee clone() throws CloneNotSupportedException {
        Employee cloned=(Employee)super.clone();
        cloned.date=new Date();
        return cloned;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
