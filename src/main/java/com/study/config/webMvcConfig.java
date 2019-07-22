package com.study.config;

import com.study.filter.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//配置类，对某个类进行配置，比如拦截器，设置拦截器需要拦截哪些url，不拦截哪些url。
@Configuration
public class webMvcConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器
     * @param registry
     * addPathPatterns 是拦截某个url；
     * excludePathPatterns 是忽视某个url
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/hello");
    }

    /**
     * 添加路径映射,视图控制器
     * 路径映射，某些url请求不需要经过controller，去服务层调用数据后渲染，再传回给前端，
     *          因此可以直接将某个url映射到某个视图（view）上，以提高访问速度。
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/loginTest").setViewName("login");
        registry.addViewController("/uploadfile").setViewName("upload");
    }
}

