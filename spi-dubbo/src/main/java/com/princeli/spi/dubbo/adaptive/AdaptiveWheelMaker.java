package com.princeli.spi.dubbo.adaptive;

import com.princeli.spi.api.Wheel;
import com.princeli.spi.api.WheelMaker;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author : princeli
 * @version 1.0
 * @className AdaptiveWheelMaker
 * @date 2019-10-14 21:16
 * @description: TODO
 */
@Adaptive
public class AdaptiveWheelMaker implements WheelMaker{

    private static volatile String DEFAULT_WHEELMAKER;

    public static void setDefaultWheelMaker(String wheelMaker) {
        DEFAULT_WHEELMAKER = wheelMaker;
    }

    @Override
    public Wheel makeWheel(URL url) {
        WheelMaker wheelMaker;
        ExtensionLoader<WheelMaker> loader = ExtensionLoader.getExtensionLoader(WheelMaker.class);
        String name = DEFAULT_WHEELMAKER; // copy reference
        if (name != null && name.length() > 0) {
            wheelMaker = loader.getExtension(name);
        } else {
            wheelMaker = loader.getDefaultExtension();
        }
        return wheelMaker.makeWheel(url);
    }
}
