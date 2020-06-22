package codepointdemo;

//码点与代码单元的区别
public class CodePointDemo {

    public static void main(String[] args) {

        //一个字符占据了两个代码单元
        String str="\uD83C\uDF3C";
        //获取代码单元的数量
        System.out.println(str.length());
        //获取码点个数，也就是字符个数
        System.out.println(str.codePointCount(0,str.length()));

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println("\uD83C\uDF3C");
    }
}
