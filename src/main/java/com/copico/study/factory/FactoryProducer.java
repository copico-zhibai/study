package com.copico.study.factory;

import com.copico.study.factory.chape.ShapeFactory;
import com.copico.study.factory.color.ColorFactory;

/**
 * Created by Owen on 2019/12/1
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }

}
