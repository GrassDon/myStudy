package com.JVM;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/8/24 17:26
 */
public class LocalVariables {
    public void addNum(int a, int b){
        int c = 1;
        int d = 2;
        int f = 4;
        {
            int e = a + b;
        }
    }
}
