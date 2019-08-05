package com.angelo.java.spi;

import com.angelo.java.spi.api.CarInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CarDemo {

    public static void main(String[] args) {
        ServiceLoader<CarInterface> serviceLoader = ServiceLoader.load(CarInterface.class);
        Iterator<CarInterface> iterator = serviceLoader.iterator();
        while(iterator.hasNext()) {
            CarInterface carInterface = iterator.next();
            carInterface.getColor();
        }
    }
}
