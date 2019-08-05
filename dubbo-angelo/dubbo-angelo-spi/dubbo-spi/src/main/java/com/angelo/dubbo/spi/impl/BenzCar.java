package com.angelo.dubbo.spi.impl;

import com.angelo.dubbo.spi.api.CarInterface;
import org.apache.dubbo.common.URL;

public class BenzCar implements CarInterface {

    private CarInterface carInterface;

    // 注入点
    public void setCarInterface(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

//    private PersonInterface personInterface;

//    public void setPersonInterface(PersonInterface personInterface) {
//        this.personInterface = personInterface;
//    }

    @Override
    public void getColor(URL url) {
        System.out.println("HIA HIA HIA");
        carInterface.getColor(url);
    }
}
