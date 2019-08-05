package com.angelo.dubbo.spi;

import com.angelo.dubbo.spi.api.CarInterface;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CarDemo {

    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);

        Map<String, String> map = new HashMap<>();
        map.put("car", "red");
        URL url = new URL("","",1, map);

        CarInterface carInterface = extensionLoader.getExtension("benz");
        carInterface.getColor(url);

        // 自动注入
        // AOP

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
