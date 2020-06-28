package clonedemo;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        Employee staff=new Employee("小白",1000,new Date());
        try {
            Employee staff_2 = staff.clone();
            System.out.println(staff);
            staff_2.setDate(new Date(1999,9,5));
            System.out.println(staff_2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
