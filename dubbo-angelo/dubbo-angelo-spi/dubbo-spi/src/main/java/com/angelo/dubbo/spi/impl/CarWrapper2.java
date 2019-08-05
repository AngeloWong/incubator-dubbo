package com.angelo.dubbo.spi.impl;

import com.angelo.dubbo.spi.api.CarInterface;
import org.apache.dubbo.common.URL;

public class CarWrapper2 implements CarInterface {
    private CarInterface carInterface;

    public CarWrapper2(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor(URL url) {
        System.out.println("before2");
        // ... AOP
        carInterface.getColor(url);
        // ...
        System.out.println("after2");
    }
}
