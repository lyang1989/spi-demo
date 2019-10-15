package com.princeli.spi.dubbo.activate;

import com.princeli.spi.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : princeli
 * @version 1.0
 * @className ValueActivateExtImpl
 * @date 2019-10-15 18:42
 * @description: TODO
 */
@Activate(value = {"value1"}, group = {"value"})
public class ValueActivateExtImpl implements ActivateExt {

    @Override
    public String echo(String msg) {
        return "value:"+msg;
    }
}
