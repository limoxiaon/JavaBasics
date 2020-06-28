package interfacedemo;

import java.util.Arrays;
import java.util.Comparator;

//实现Comparator接口
public class Sort_2Demo {

    public static void main(String[] args) {
        String[] strings={"xiao","xiaoli","hei"};
        Comparator<String> comparator=new LengthComparator();
        Arrays.sort(strings,comparator);

        for(String s:strings){
            System.out.println(s);
        }
    }
}
