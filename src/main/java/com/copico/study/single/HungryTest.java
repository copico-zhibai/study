package com.copico.study.single;

import java.util.concurrent.CountDownLatch;

/**
 * @author owen
 */
public class HungryTest {

    public static void main(String[] args) {
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
                System.out.println(Hungry.getHungry());
            }).start();
            latch.countDown();
        }
    }

}
