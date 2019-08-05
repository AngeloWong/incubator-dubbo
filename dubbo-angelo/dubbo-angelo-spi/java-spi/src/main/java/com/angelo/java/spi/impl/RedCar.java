package com.angelo.java.spi.impl;

import com.angelo.java.spi.api.CarInterface;

public class RedCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("RED");
    }
}
