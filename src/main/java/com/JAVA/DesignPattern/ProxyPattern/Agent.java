package com.JAVA.DesignPattern.ProxyPattern;

/**
 * <p>
 * 说明：经纪人
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/5 14:56
 */
public class Agent implements Performer{

    Singer singer;

    @Override
    public void sing () {
        if(null == singer){
            singer = new Singer();
        }
        singer.sing();
    }

    @Override
    public void dance () {
        if(null == singer){
            singer = new Singer();
        }
        singer.dance();
    }
}
