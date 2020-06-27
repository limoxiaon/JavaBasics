package reflectdemo;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {

        //读取类的名字
        String name;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入类名(例如：java.util.Date):");
        name=input.next();

        try {
            //获取父类和类的修饰符
            Class c1=Class.forName(name);
            Class superC1=c1.getSuperclass();
            String modifiers= Modifier.toString(c1.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print("class "+name);
            if(superC1!=null&&superC1!=Object.class)
                System.out.print(" extends "+superC1.getName());
            System.out.println();
            System.out.println("{");
            Constructor[] constructors=c1.getConstructors();
            for(Constructor constructor:constructors){
                String modifier=Modifier.toString(constructor.getModifiers());
                System.out.print("   "+modifier);
                System.out.print(" "+c1.getName());
                System.out.print("(");
                Type[] types=constructor.getParameterTypes();
                for (int i = 0; i <types.length; i++) {
                    if(i==0)
                        System.out.print(types[i].getTypeName());
                    else
                        System.out.print(","+types[i]);
                }
                System.out.print(")\n");
            }
            System.out.println();
            Method[] methods=c1.getMethods();
            for(Method method:methods){
                String modifier= Modifier.toString(method.getModifiers());
                System.out.print("   "+modifier);
                String returnType=method.getReturnType().getName();
                System.out.print(" "+returnType);
                System.out.print(" "+method.getName());
                System.out.print("(");
                Type[] types=method.getParameterTypes();
                for (int i = 0; i <types.length; i++) {
                    if(i==0)
                        System.out.print(types[i].getTypeName());
                    else
                        System.out.print(","+types[i]);
                }
                System.out.print(")"+";"+"\n");
            }
            System.out.println();
            Field[] fields1=c1.getDeclaredFields();
            for (Field field:fields1) {
                String modifier=Modifier.toString(field.getModifiers());
                System.out.print("   "+modifier);
                String returnType=field.getType().getName();
                System.out.print(" "+returnType);
                System.out.print(" "+field.getName()+";");
                System.out.println();
            }
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
