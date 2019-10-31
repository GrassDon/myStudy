package com.JAVA.Genericity;

/**
 * <p>
 * 说明：泛型测试类
 * 泛型类的好处：在写代码时规定参数的类型，防止参数传入错误
 * 使用：需要在实例化时指定类型。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/30 16:39
 */
public class Teacher<T extends Human> {
    public T human;
    public Teacher(T human) {
         super();
         this.human = human;
     }
     public Teacher() {
         super();
    }

    public T getHuman () {
        return human;
    }

    public void setHuman (T human) {
        this.human = human;
    }

    public static void main (String[] args) {
        Human human = new Human("dong","男",24);
        Teacher<Human> teacher = new Teacher();
        teacher.setHuman(human);
        /*Teacher teacher = new Teacher();
        teacher.setName(3);*/
        System.out.println(teacher.getHuman().getName());

        /**
         * 不能对确切的泛型类型使用instanceof操作。如下面的操作是非法的，编译时会出错。
　　      if(ex_num instanceof Generic<Number>){ }
          要写成if(ex_num instanceof Generic<T>){ }
         */
    }
}
