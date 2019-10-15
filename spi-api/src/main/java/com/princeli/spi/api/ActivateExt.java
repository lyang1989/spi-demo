package com.princeli.spi.api;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author : princeli
 * @version 1.0
 * @className ActivateExt
 * @date 2019-10-15 18:35
 * @description: TODO
 */
@SPI
public interface ActivateExt {
    String echo(String msg);
}
