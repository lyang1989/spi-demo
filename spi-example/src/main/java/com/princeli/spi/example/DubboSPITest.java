package com.princeli.spi.example;

import com.princeli.spi.api.ActivateExt;
import com.princeli.spi.api.CarMaker;
import com.princeli.spi.api.Robot;
import com.princeli.spi.api.WheelMaker;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : princeli
 * @version 1.0
 * @className DubboSPITest
 * @date 2019-10-14 19:44
 * @description: TODO
 */
public class DubboSPITest {


    /**
     * 1.静态拓展点
     */
    @Test
    public void testStaticExtension() {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }


    /**
     * 2.自适应拓展点
     * 类-自定义Adpative适配
     */
    @Test
    public void testCustomAdpative() {
        ExtensionLoader<WheelMaker> wheelMakerExtensionLoader = ExtensionLoader.getExtensionLoader(WheelMaker.class);
        WheelMaker wheelMaker = wheelMakerExtensionLoader.getAdaptiveExtension();
        System.out.println(wheelMaker);

        Map<String, String> parameters = new HashMap<String, String>();
        URL url = new URL("dubbo", "127.0.0.1", 8089, parameters);
        System.out.println(wheelMaker.makeWheel(url));
    }


    /**
     * 2.自适应拓展点
     * 方法-Adpative动态适配
     */
    @Test
    public void testDynamicAdpative() {
        ExtensionLoader<CarMaker> carMakerExtensionLoader = ExtensionLoader.getExtensionLoader(CarMaker.class);
        CarMaker carMaker = carMakerExtensionLoader.getAdaptiveExtension();
        System.out.println(carMaker);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("type", "racecar");
        URL url = new URL("dubbo", "127.0.0.1", 8089, parameters);
        System.out.println(carMaker.makeCar(url,"法拉利"));
    }


    /**
     * 3.激活拓展点
     * @Activate注解中声明group
     */
    @Test
    public void testDefault() {
        ExtensionLoader<ActivateExt> loader = ExtensionLoader.getExtensionLoader(ActivateExt.class);
        URL url = URL.valueOf("test://localhost/test");
        //查询组为default_group的ActivateExt的实现
        List<ActivateExt> list = loader.getActivateExtension(url, new String[]{}, "default_group");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
    }


    /**
     * 3.激活拓展点
     * @Activate注解中声明多个group
     */
    @Test
    public void testGrpup() {
        URL url = URL.valueOf("test://localhost/test");
        //查询组为group2的ActivateExt的实现
        List<ActivateExt> list = ExtensionLoader.getExtensionLoader(ActivateExt.class).getActivateExtension(url, new String[]{}, "group2");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
    }

    /**
     * 3.激活拓展点
     * @Activate注解中声明了group与value
     */
    @Test
    public void testValue() {
        URL url = URL.valueOf("test://localhost/test");
        //根据   key = value1,group =  value
        //@Activate(value = {"value1"}, group = {"value"})来激活扩展
        url = url.addParameter("value1", "value");
        List<ActivateExt> list = ExtensionLoader.getExtensionLoader(ActivateExt.class).getActivateExtension(url, new String[]{}, "value");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
    }

    /**
     * 3.激活拓展点
     * @Activate注解中声明了order,低的排序优先级高
     */
    @Test
    public void testOrder() {
        URL url = URL.valueOf("test://localhost/test");
        List<ActivateExt> list = ExtensionLoader.getExtensionLoader(ActivateExt.class).getActivateExtension(url, new String[]{}, "order");
        System.out.println(list.size());
        System.out.println(list.get(0).getClass());
        System.out.println(list.get(1).getClass());
    }


}
