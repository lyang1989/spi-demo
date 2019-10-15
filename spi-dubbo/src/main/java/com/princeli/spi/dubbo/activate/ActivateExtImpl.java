package com.princeli.spi.dubbo.activate;

import com.princeli.spi.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : princeli
 * @version 1.0
 * @className ActivateExtImpl
 * @date 2019-10-15 18:36
 * @description: TODO
 */
@Activate(group = {"default_group"})
public class ActivateExtImpl implements ActivateExt {
    @Override
    public String echo(String msg) {
        return "default:"+msg;
    }
}
