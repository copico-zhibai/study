package com.copico.study.factory;

import com.copico.study.factory.chape.Shape;
import com.copico.study.factory.color.Color;

/**
 * Created by Owen on 2019/11/30
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
