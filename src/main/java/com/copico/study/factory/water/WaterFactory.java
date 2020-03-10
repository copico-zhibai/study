package com.copico.study.factory.water;

import java.util.Objects;

/**
 * @author owen
 */
//在工厂中统一管理，给一个具体的'标签'（名称或者ID），来得到对应的水，
// 类似Spring中通过不同的bean名称获取不同的注入对象
public class WaterFactory {

    public static Water getWater(String waterName) {
        if (Objects.equals(waterName, "农夫山泉")) {
            return new NongFu();
        }
        if (Objects.equals(waterName, "百岁山")) {
            return new BaiSuiShan();
        }
        return null;
    }

}
