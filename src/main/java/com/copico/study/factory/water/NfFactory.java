package com.copico.study.factory.water;

/**
 * @author owen
 */
public class NfFactory implements IFactory {
    @Override
    public Bottle createBottle() {
        return new NfBottle();
    }

    @Override
    public Water createWater() {
        return new NongFu();
    }
}
