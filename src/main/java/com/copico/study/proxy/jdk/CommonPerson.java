package com.copico.study.proxy.jdk;

/**
 * @author owen
 */
public class CommonPerson implements Person {
    @Override
    public void buy() {
        System.out.println("付钱买东西");
    }
}
