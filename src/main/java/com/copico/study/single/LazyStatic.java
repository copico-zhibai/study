package com.copico.study.single;

/**
 * @author owen
 */
public class LazyStatic {

    private static boolean initialized = false;

    private LazyStatic() {
        synchronized (LazyStatic.class) {
            if (!initialized) {
                initialized = true;
            } else {
                throw new RuntimeException("避免多次实例化");
            }
        }
    }

    public static LazyStatic getInstance() {
        return lazyHandler.LAZY;
    }

    private static class lazyHandler {
        private static final LazyStatic LAZY = new LazyStatic();
    }

}
