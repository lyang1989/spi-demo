package com.princeli.spi.dubbo.adaptive;

import com.princeli.spi.api.Car;
import com.princeli.spi.api.CarMaker;
import com.princeli.spi.api.Wheel;
import com.princeli.spi.api.WheelMaker;
import org.apache.dubbo.common.URL;

/**
 * @author : princeli
 * @version 1.0
 * @className FamilyCarMaker
 * @date 2019-10-14 22:22
 * @description: TODO
 */
public class FamilyCarMaker implements CarMaker {
    WheelMaker wheelMaker;

    // 通过 setter 注入 AdaptiveWheelMaker
    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }

    @Override
    public Car makeCar(URL url,String brand) {
        Wheel wheel = wheelMaker.makeWheel(url);
        return new Car(brand, wheel);
    }
}
