package com.copico.study.proxy.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author owen
 */
//代购
//代理类需要有真是对象的控制权（引用）
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyPerson implements Person {

    private CommonPerson commonPerson;

    @Override
    public void buy() {
        System.out.println("买之前的工作，挑选，跑去商店");
        commonPerson.buy();
        System.out.println("买之后的工作，退换货，评价商品");
    }
}
