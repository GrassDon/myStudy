package com.study.strategyPattern;

import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 说明：加法
 * <li></li>
 * </p>
 *
 * @author Don
 * @date 2019/8/20 21:05
 */
public class add implements Math {

    @Override
    public int  calculate(int a,int b) {
        return a+b;
    }
}
