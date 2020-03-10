package com.copico.study.factory.water;

/**
 * @author owen
 */
public class BaiSuiShanFactory extends AbstractWaterFactor {
    @Override
    public Water productWater() {
        return new BaiSuiShan();
    }
}
