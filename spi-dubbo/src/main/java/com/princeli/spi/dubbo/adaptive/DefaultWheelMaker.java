package com.princeli.spi.dubbo.adaptive;

import com.princeli.spi.api.Wheel;
import com.princeli.spi.api.WheelMaker;
import org.apache.dubbo.common.URL;

/**
 * @author : princeli
 * @version 1.0
 * @className DefaultWheelMaker
 * @date 2019-10-14 21:22
 * @description: TODO
 */
public class DefaultWheelMaker implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        Wheel wheel = new Wheel();
        wheel.setName("default");
        return wheel;
    }

}
