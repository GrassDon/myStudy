package com.study.GlobalExceptionHandler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 说明：全局异常处理类
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/29 14:03
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public String nullPointerExceptionHandler(ArithmeticException ex) {
        JSONObject jsonObject = new JSONObject();
        System.err.println("ArithmeticException:"+ex);
        return "ArithmeticException:"+ex.getMessage();
    }
}
