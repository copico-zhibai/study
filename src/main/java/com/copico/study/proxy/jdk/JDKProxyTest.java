package com.copico.study.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author owen
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        CommonPerson person = new CommonPerson();
        ProxyPersonHandler handler = new ProxyPersonHandler(person);
        Person proxyPerson = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), handler);
        proxyPerson.buy();
    }
}
