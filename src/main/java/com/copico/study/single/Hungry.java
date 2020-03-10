package com.copico.study.single;

/**
 * 线程安全的
 *
 * @author owen
 */
public class Hungry {

    private Hungry() {
    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getHungry() {
        return hungry;
    }
}
