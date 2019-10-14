package com.princeli.spi.example;

import com.princeli.spi.api.Robot;

import java.util.ServiceLoader;

/**
 * @author : princeli
 * @version 1.0
 * @className JavaSPITest
 * @date 2019-10-11 21:50
 * @description: TODO
 */
public class JavaSPITest {
    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        for (Robot robot:serviceLoader) {
            robot.sayHello();
        }
    }
}
