package lambdademo;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
//函数式接口
public class LambdaTest {

    public static void main(String[] args) {
        String[] planets=new String[]{"xiaoli","xiaohei","lisi","zhangsan"};
        System.out.println(Arrays.toString(planets));
        System.out.println("默认排序");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("按照长度进行排序");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer time=new Timer(1000,event-> System.out.println("The time is "+new Date()));
        time.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
