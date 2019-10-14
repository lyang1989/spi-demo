package com.princeli.spi.dubbo;

import com.princeli.spi.api.Robot;

/**
 * @author : princeli
 * @version 1.0
 * @className Bumblebee
 * @date 2019-10-14 19:25
 * @description: TODO
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
