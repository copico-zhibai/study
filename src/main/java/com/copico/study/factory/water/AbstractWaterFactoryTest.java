package com.copico.study.factory.water;

/**
 * @author owen
 */
public class AbstractWaterFactoryTest {

    public static void main(String[] args) {
        BaiSuiShanFactory baiSuiShanFactory = new BaiSuiShanFactory();
        Water water = baiSuiShanFactory.productWater();
        water.drink();

        NongFuFactory nongFuFactory = new NongFuFactory();
        Water water1 = nongFuFactory.productWater();
        water1.drink();
    }

}
