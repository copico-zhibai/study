package com.copico.study.factory.water;

/**
 * @author owen
 */
public class NongFuFactory extends AbstractWaterFactor {
    @Override
    public Water productWater() {
        return new NongFu();
    }
}
