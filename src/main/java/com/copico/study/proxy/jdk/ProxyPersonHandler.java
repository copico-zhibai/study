package com.copico.study.proxy.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author owen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyPersonHandler implements InvocationHandler {
    //被代理的目标对象
    private Object target;

    public Object getInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("加强1");
        method.invoke(target, args);
        System.out.println("加强2");
        return null;
    }
}
