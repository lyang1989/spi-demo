package com.princeli.spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author : princeli
 * @version 1.0
 * @className WheelMaker
 * @date 2019-10-14 21:15
 * @description: TODO
 */
@SPI("michelin")
public interface WheelMaker {

    Wheel makeWheel(URL url);

}
