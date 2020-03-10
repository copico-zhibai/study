package com.copico.study.proxy.test1;

/**
 * @author owen
 */
public class ProxyTest {
    public static void main(String[] args) {
        CommonPerson commonPerson = new CommonPerson();
        ProxyPerson proxyPerson = new ProxyPerson(commonPerson);
        proxyPerson.buy();
    }
}
