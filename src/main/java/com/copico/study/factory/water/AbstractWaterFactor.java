package com.copico.study.factory.water;

/**
 * @author owen
 */
public abstract class AbstractWaterFactor {
    //让各自的子类工厂完成具体的生产
    public abstract Water productWater();
}