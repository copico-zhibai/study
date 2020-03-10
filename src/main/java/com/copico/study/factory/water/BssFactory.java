package com.copico.study.factory.water;

/**
 * @author owen
 */
public class BssFactory implements IFactory {
    @Override
    public Bottle createBottle() {
        return new BssBottle();
    }

    @Override
    public Water createWater() {
        return new BaiSuiShan();
    }
}
