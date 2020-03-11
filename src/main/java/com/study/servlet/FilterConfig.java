package com.study.servlet;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 说明：通过bean配置的方式设置拦截器的具体拦截范围
 *       和webfilter注解功能一样。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/3/11 16:30
 */

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean config(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        myFilter myFilter = new myFilter();
        registrationBean.setFilter(myFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
