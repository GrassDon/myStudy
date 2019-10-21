package com.study.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.text.TextConfigurationRealm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 说明：shiro安全管理
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/7 10:39
 */
@Configuration
public class ShiroConfig {
    /**
     * 配置两个用户：dong/123，身份为user，admin/123，身份为admin，分别为只读和读写权限
     * realm可以自定义一个，也可以用默认的，这里也可以配置数据库链接
     * @return
     */
    @Bean
    public Realm realm(){
        TextConfigurationRealm textConfigurationRealm = new TextConfigurationRealm();
        textConfigurationRealm.setUserDefinitions("dong=123,user\n admin=123,admin");
        textConfigurationRealm.setRoleDefinitions("admin=read,write\n user=read");
        return textConfigurationRealm;
    }

    /**
     * 配置匿名规则，“/login”和“/doLogin”可以匿名访问，“/logout”是一个注销登陆请求，其余请求则
     * 需要认证之后才能访问
     * @return
     */
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(){
        DefaultShiroFilterChainDefinition chainDefinition =
                new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/login","anon");
        chainDefinition.addPathDefinition("/doLogin","anon");
        chainDefinition.addPathDefinition("/logout","logout");
        chainDefinition.addPathDefinition("/**","authc");
        return chainDefinition;
    }
    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }
}
