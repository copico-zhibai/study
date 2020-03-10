package com.copico.study.factory.water;

/**
 * @author owen
 */
public class IFactoryTest {
    public static void main(String[] args) {
        BssFactory bssFactory = new BssFactory();
        Bottle bottle = bssFactory.createBottle();
        Water water = bssFactory.createWater();
        bottle.shape();
        water.drink();

        NfFactory nfFactory = new NfFactory();
        Bottle bottle1 = nfFactory.createBottle();
        Water water1 = nfFactory.createWater();
        bottle1.shape();
        water1.drink();
    }
}
