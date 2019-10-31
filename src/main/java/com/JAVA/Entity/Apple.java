package com.JAVA.Entity;

/**
 * <p>
 * 说明：苹果实体类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/31 15:14
 */
public class Apple {
    String color;
    String weight;

    public Apple (String color, String weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor () {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getWeight () {
        return weight;
    }

    public void setWeight (String weight) {
        this.weight = weight;
    }
}
