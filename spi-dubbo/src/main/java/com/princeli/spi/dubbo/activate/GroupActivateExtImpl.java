package com.princeli.spi.dubbo.activate;

import com.princeli.spi.api.ActivateExt;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : princeli
 * @version 1.0
 * @className GroupActivateExtImpl
 * @date 2019-10-15 18:38
 * @description: TODO
 */
@Activate(group = {"group1", "group2"})
public class GroupActivateExtImpl implements ActivateExt {
    @Override
    public String echo(String msg) {
        return "group:"+msg;
    }
}
