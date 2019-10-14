package com.princeli.spi.example;

import com.princeli.spi.api.Robot;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author : princeli
 * @version 1.0
 * @className DubboSPITest
 * @date 2019-10-14 19:44
 * @description: TODO
 */
public class DubboSPITest {
    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
