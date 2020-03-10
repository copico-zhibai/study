package com.copico.study.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author owen
 */
//班级
@Data
public class Class implements Serializable {
    private String name;
}
