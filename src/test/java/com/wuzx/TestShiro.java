package com.wuzx;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;

public class TestShiro {


    @Test
    public void testLogin() {
        // chaung
        DefaultSecurityManager manager = new DefaultSecurityManager();
        IniRealm realm = new IniRealm("classpath:shiro-quick-start.ini");

        manager.setRealm(realm);
        // 绑定manager,主要是为了初始化一些东西
        SecurityUtils.setSecurityManager(manager);

        // 主体
        final Subject subject = SecurityUtils.getSubject();


        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("system","system2");
        subject.login(usernamePasswordToken);

        // 是否登录
        if (subject.isAuthenticated()) {
            System.out.println("登录成功，登录用户" + subject.getPrincipal());
        }

        // 登出
        subject.logout();

        if (subject.isAuthenticated()) {
            System.out.println("登录成功，登录用户" + subject.getPrincipal());
        } else {
            System.out.println("未登录");
        }
    }
}
