package com.princeli.spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author : princeli
 * @version 1.0
 * @className CarMaker
 * @date 2019-10-14 22:07
 * @description: TODO
 */
@SPI
public interface CarMaker {
    @Adaptive({"type"})
    Car makeCar(URL url,String brand);
}
