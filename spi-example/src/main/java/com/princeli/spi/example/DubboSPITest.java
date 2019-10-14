package com.princeli.spi.example;

import com.princeli.spi.api.CarMaker;
import com.princeli.spi.api.Robot;
import com.princeli.spi.api.WheelMaker;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : princeli
 * @version 1.0
 * @className DubboSPITest
 * @date 2019-10-14 19:44
 * @description: TODO
 */
public class DubboSPITest {
    public static void main(String[] args) {

        //1.静态拓展点
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();

        //2.自适应拓展点

        //类
        //ExtensionLoader<Compiler> compilerExtensionLoader = ExtensionLoader.getExtensionLoader(Compiler.class);
        //Compiler Compiler = compilerExtensionLoader.getAdaptiveExtension();
        //System.out.println(Compiler);


        //类-自定义Adpative适配
        ExtensionLoader<WheelMaker> wheelMakerExtensionLoader = ExtensionLoader.getExtensionLoader(WheelMaker.class);
        WheelMaker wheelMaker = wheelMakerExtensionLoader.getAdaptiveExtension();
        System.out.println(wheelMaker);

        Map<String, String> parameters = new HashMap<String, String>();
        URL url = new URL("dubbo", "127.0.0.1", 8089, parameters);
        System.out.println(wheelMaker.makeWheel(url));



        //方法-Adpative动态适配
        ExtensionLoader<CarMaker> carMakerExtensionLoader = ExtensionLoader.getExtensionLoader(CarMaker.class);
        CarMaker carMaker = carMakerExtensionLoader.getAdaptiveExtension();
        System.out.println(carMaker);

        parameters = new HashMap<String, String>();
        parameters.put("type", "racecar");
        url = new URL("dubbo", "127.0.0.1", 8089, parameters);
        System.out.println(carMaker.makeCar(url,"法拉利"));

        //3.激活拓展点







    }
}
