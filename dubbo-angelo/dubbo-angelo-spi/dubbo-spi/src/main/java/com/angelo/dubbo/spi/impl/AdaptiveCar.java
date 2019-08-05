package com.angelo.dubbo.spi.impl;

import com.angelo.dubbo.spi.api.CarInterface;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * 加上 @Adaptive， 代表此处AdaptiveCar为CarInterface的代理类
 */
//@Adaptive
public class AdaptiveCar implements CarInterface {  // 代理类
    @Override
    public void getColor(URL url) {
        System.out.println("RED");
    }
}
