package com.copico.study.prototype;

import lombok.Data;

/**
 * @author owen
 */
@Data
public class Student implements Cloneable {

    private Integer id;

    private String idCard;

    private Class aClass;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}