package com.study.strategyPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author DON
 * @date 2019/8/20 20:49
 */
public class Test {
    public static void main(String[] args){
        Map<String,Math> map = new HashMap<String , Math>();
        map.put("add",new add());
        map.put("sub",new sub());
        MathStrategy mathStrategy = new MathStrategy(map.get("sub"));
        mathStrategy.domath(4,2);
    }
}
