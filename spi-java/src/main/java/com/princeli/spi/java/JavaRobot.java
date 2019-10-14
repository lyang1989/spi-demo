package com.princeli.spi.java;

import com.princeli.spi.api.Robot;

/**
 * @author : princeli
 * @version 1.0
 * @className JavaRobot
 * @date 2019-10-14 19:29
 * @description: TODO
 */
public class JavaRobot implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am JavaRobot.");
    }
}
