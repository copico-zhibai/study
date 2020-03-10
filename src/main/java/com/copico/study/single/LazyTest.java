package com.copico.study.single;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;

/**
 * @author owen
 */
public class LazyTest {

    public static void main(String[] args) {
        int count = 10;
        final CountDownLatch latch = new CountDownLatch(count);
        System.out.println("主程序开始执行");
        //第一个子线程执行
        while (count > 0) {
            count--;
            new Thread(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(LocalDateTime.now() + ":" + Lazy.getInstance());
            }).start();
            latch.countDown();
        }
    }


    public static void test(String[] args) {
        for (int i = 0; i < 100; i++) {
            Hungry hungry = Hungry.getHungry();
            System.out.println(hungry);
        }
    }


}
