package interfacedemo;

import java.util.Arrays;

//实现Comparable接口
public class EmployeeSortTest {

    public static void main(String[] args) {
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("xiaoli",1000);
        staff[1]=new Employee("xiaobai",2000);
        staff[2]=new Employee("xiaohei",500);
        Arrays.sort(staff);

        for(Employee e:staff){
            System.out.println("name="+e.getName()+"salary="+e.getSalary());
        }
    }
}
