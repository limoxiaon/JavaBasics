package classinitdemo;

//调用构造器的具体步骤
public class ClassInitDemo {
    /*
     *1、所有域都初始化成默认值
     *2、先调用静态代码块，再到代码块
     *3、再执行构造器方法
     */

    private static int nextId;

    private String name;

    {
        System.out.println(name);
        nextId++;
        name+="hello";
        System.out.println("初始化代码块");
    }

    static
    {
        nextId++;
        System.out.println("初始化静态代码块");
    }

    public ClassInitDemo(){
        this.name="xiaoli";
        nextId++;
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        ClassInitDemo classInitDemo=new ClassInitDemo();
    }
}
