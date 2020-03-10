package com.copico.study.single;

import java.util.HashMap;
import java.util.Map;

/**
 * @author owen
 */
public class Register {

    private Register() {
    }

    private static Map<String, Object> register = new HashMap<>();

    public static Register getInstance(String name) {
        if (name == null) {
            name = Register.class.getName();
        }
        if (register.get(name) == null) {
            register.put(name, new Register());
        }
        return (Register) register.get(name);
    }

}
