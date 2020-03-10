package com.copico.study.single;

/**
 * @author owen
 */
public class Lazy {
    private Lazy() {
    }

    private static Lazy lazy;

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
