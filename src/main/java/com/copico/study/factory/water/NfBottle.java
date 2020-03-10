package com.copico.study.factory.water;

/**
 * @author owen
 */
public class NfBottle implements Bottle {
    @Override
    public void shape() {
        System.out.println("圆锥形");
    }
}
