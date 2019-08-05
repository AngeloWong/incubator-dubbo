package com.angelo.dubbo.spi.impl;

import com.angelo.dubbo.spi.api.CarInterface;
import org.apache.dubbo.common.URL;

public class RedCar implements CarInterface {
    @Override
    public void getColor(URL url) {
        System.out.println("RED");
    }
}
