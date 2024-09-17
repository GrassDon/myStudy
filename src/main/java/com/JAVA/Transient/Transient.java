package com.JAVA.Transient;

import java.io.*;

/**
 * <p>
 * 说明：Transient关键字测试
 *      被Transient关键字修饰的变量，不会被serialiaztion机制序列化
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/12/18 15:01
 */
public class Transient implements Serializable {
    private static final long serialVersionUID = 233858934995755239L;
    private String name1;
    private transient String name2;

    public Transient(String name1,String name2){
        this.name1 = name1;
        this.name2 = name2;
    }
    @Override
    public String toString () {
        return "Transient{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    public static void main (String[] args) {
        Transient test = new Transient("常规属性","被transient修饰的属性");
        System.out.println("序列化前："+test.toString());
        ObjectOutputStream outStream;
        ObjectInputStream inStream;
        String filePath = "C:\\Users\\Administrator\\Desktop\\test.txt";
        try {
            outStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outStream.writeObject(test);

            inStream = new ObjectInputStream(new FileInputStream(filePath));
            Transient readObject = (Transient)inStream.readObject();
            System.out.println("序列化后："+readObject.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
