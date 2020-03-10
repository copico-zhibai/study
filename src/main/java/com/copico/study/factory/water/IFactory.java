package com.copico.study.factory.water;

/**
 * @author owen
 */
public interface IFactory {
    Bottle createBottle();

    Water createWater();
}
