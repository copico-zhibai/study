package com.copico.study.factory.water;

import java.util.Objects;

/**
 * @author owen
 */
public class WaterFactoryTest {

    public static void main(String[] args) {
        Water nf = WaterFactory.getWater("农夫山泉");
        Objects.requireNonNull(nf).drink();

        Water bss = WaterFactory.getWater("百岁山");
        Objects.requireNonNull(bss).drink();
    }

}
