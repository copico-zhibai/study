package com.copico.study.factory.water;

/**
 * @author owen
 */
//每个品牌都有自己独特的配方，客户不需要会制作，同时秘方也不想告知客户
public class NongFu implements Water {
    @Override
    public void drink() {
        System.out.println("农夫山泉有点甜");
    }
}