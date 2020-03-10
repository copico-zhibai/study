package com.copico.study.single;

/**
 * @author owen
 */
public class LazySync {
    private LazySync() {
    }

    private static LazySync lazy;

    public static synchronized LazySync getInstance() {
        if (lazy == null) {
            lazy = new LazySync();
        }
        return lazy;
    }
}
