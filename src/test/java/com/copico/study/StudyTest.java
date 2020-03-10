package com.copico.study;

import com.copico.study.single.LazyStatic;
import com.copico.study.single.LazySync;
import com.copico.study.single.Register;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class StudyTest {

    @Test
    void contextLoads() throws InterruptedException {
        int count = 5;
        CountDownLatch latch = new CountDownLatch(count);
        System.out.println("主程序开始执行");
        while (count > 1) {
            System.out.println(count);
            count--;
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("world");
            }).start();
            latch.countDown();
        }

        TimeUnit.SECONDS.sleep(3);
        latch.countDown();
    }

    @Test
    public void testLazySync() {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);
        while (count > 0) {
            count--;
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LazySync.getInstance());
            }).start();
            latch.countDown();
        }
    }

    @Test
    public void testLazyStatic() {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);
        while (count > 0) {
            count--;
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LazyStatic.getInstance());
            }).start();
            latch.countDown();
        }
    }

    @Test
    public void testClazz() throws Exception {
        //正常方法获取实例
        System.out.println(LazyStatic.getInstance());

        //通过反射方式获取私有化构造器
        Class<LazyStatic> clazz = LazyStatic.class;
        Constructor<LazyStatic> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyStatic lazyStatic = constructor.newInstance();
        System.out.println(lazyStatic);
    }

    @Test
    public void testRegister(){
        Register instance = Register.getInstance("6666");
        System.out.println(instance);
        Register instance1 = Register.getInstance("888");
        System.out.println(instance1);
    }

}
