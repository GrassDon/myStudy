package com.study.controller;

import com.sun.deploy.net.protocol.ProtocolType;
import org.apache.catalina.authenticator.SpnegoAuthenticator;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.context.annotation.Scope;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 * 说明：shiro测试控制器
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/7 11:11
 */
@Controller
public class UserController {
    @PostMapping("/doLogin")
    public String doLogin(String user, String password, Model model){
        UsernamePasswordToken token = new UsernamePasswordToken(user,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (AuthenticationException e){
            model.addAttribute("error","用户名密码错误");
            return "login";
        }
        return "redirect:/index";
    }
}
