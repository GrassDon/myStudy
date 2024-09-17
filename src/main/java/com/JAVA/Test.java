package com.JAVA;

import com.sun.javafx.collections.MappingChange;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.object.MappingSqlQuery;

import javax.lang.model.element.NestingKind;
import java.awt.image.MultiPixelPackedSampleModel;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/8/30 9:51
 */
public class Test {
    public static void main(String[] args){
        String string = "dong";
        switch (string){
            case "dong": System.out.println("dong");break;
            case "lin": System.out.println("lin");break;
            case "su": System.out.println("su");break;
            case "shen": System.out.println("shen");break;
        }
        Format f = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        System.out.println("当前时间:" + f.format(c.getTime()));
        c.add(Calendar.MONTH, 6);
        System.out.println("半年后:" + f.format(c.getTime()));
        Map<String,Object> map = new HashMap<>();
        map.put("a","");
        System.out.println(map);

        Map<String,String> map1 = new HashMap<>();
        map1.put("dong","dongzzh");
        map1.put("dong","linxy");
        System.out.println(map1.get("dong"));

        String s1 = "lin";
        String s2 = "lin";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
