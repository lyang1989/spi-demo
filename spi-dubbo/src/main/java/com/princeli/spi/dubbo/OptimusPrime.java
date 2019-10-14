package com.princeli.spi.dubbo;

import com.princeli.spi.api.Robot;

/**
 * @author : princeli
 * @version 1.0
 * @className OptimusPrime
 * @date 2019-10-14 19:24
 * @description: TODO
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
