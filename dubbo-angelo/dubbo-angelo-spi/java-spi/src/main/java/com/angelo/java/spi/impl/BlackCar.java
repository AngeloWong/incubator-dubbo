package com.angelo.java.spi.impl;

import com.angelo.java.spi.api.CarInterface;

public class BlackCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("BLACK");
    }
}
