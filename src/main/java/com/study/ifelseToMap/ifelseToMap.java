package com.study.ifelseToMap;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 说明：将多个if-else转换成map进行管理，方便拓展
 *       开闭原则，对修改关闭，对拓展开放。
 * <li></li>
 * </p>
 *
 * @author DON
 * @date 2019/8/20 20:07
 */
public class ifelseToMap {
    private Map<String, String> processFlagMap = new HashMap<String, String>();

    public ifelseToMap(){
        init();
    }

    private void init(){
        processFlagMap.put("FLAG_A","do A");
        processFlagMap.put("FLAG_B","do B");
        processFlagMap.put("FLAG_C","do C");
        processFlagMap.put("FLAG_D","do D");
        processFlagMap.put("FLAG_E","do E");
    }

    public static void main(String[] args) {
        (new ifelseToMap()).processByFlag("FLAG_A");
    }

    private void processByFlag(String flagName){
        for(Map.Entry<String, String> processFlagEntry : processFlagMap.entrySet()){
            if(processFlagEntry.getKey().equals(flagName)){
                System.out.println(processFlagEntry.getValue());
            }
        }
    }
}
