package com.JAVA.StringBuffer;

/**
 * <p>
 * 说明：StringBuffer测试
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/12/18 14:17
 */
public class StringBufferTest {

    public static void main (String[] args) {
        /**
         * 这个类是为了解决String拼接产生多余对象的问题而提供的一个类。
         * StringBuffer保证了线程的安全，也带来了多余的开销。
         */
        StringBuffer stringBuffer = new StringBuffer("testbuffer");
        /**
         * StringBuilder的功能与StringBuffer一样。
         * 但是区别是StringBuilder没有处理线程安全，减少了开销。
         */
        StringBuilder stringBuilder = new StringBuilder("testbuilder");
        for(int i=0;i<10000;i++){
            //可以计算时间，和string比较一下
            stringBuilder.append(i);
        }
    }
}
