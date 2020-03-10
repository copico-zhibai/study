package com.copico.study.proxy.test1;

import lombok.Data;

/**
 * @author owen
 */
//普通人买东西
@Data
public class CommonPerson implements Person {
    @Override
    public void buy() {
        System.out.println("付钱买东西");
    }
}
