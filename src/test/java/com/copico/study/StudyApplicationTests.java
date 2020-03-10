package com.copico.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;

@SpringBootTest
class StudyApplicationTests {

    @Test
    void contextLoads() {
        int count = 5;
        CountDownLatch latch = new CountDownLatch(count);
        System.out.println("主程序开始执行");
        //第一个子线程执行
        while (count > 0) {
            System.out.println(count);
            count--;
            new Thread(() -> System.out.println("hello")).start();
            latch.countDown();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
