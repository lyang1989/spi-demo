package com.princeli.spi.api;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author : princeli
 * @version 1.0
 * @className Robot
 * @date 2019-10-14 19:24
 * @description: TODO
 */
@SPI
public interface Robot {
    void sayHello();
}
