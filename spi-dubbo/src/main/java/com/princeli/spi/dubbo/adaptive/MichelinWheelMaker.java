package com.princeli.spi.dubbo.adaptive;

import com.princeli.spi.api.Wheel;
import com.princeli.spi.api.WheelMaker;
import org.apache.dubbo.common.URL;

/**
 * @author : princeli
 * @version 1.0
 * @className MichelinWheelMaker
 * @date 2019-10-14 21:21
 * @description: TODO
 */
public class MichelinWheelMaker implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        Wheel wheel = new Wheel();
        wheel.setName("Michelin");
        return wheel;
    }

}
