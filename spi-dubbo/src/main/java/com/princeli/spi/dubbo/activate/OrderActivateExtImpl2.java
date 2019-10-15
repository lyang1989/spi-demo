package com.princeli.spi.dubbo.activate;

import com.princeli.spi.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : princeli
 * @version 1.0
 * @className OrderActivateExtImpl1
 * @date 2019-10-15 18:39
 * @description: TODO
 */
@Activate(order = 1, group = {"order"})
public class OrderActivateExtImpl2 implements ActivateExt {
    @Override
    public String echo(String msg) {
        return "OrderActivateExtImpl2:"+msg;
    }
}
