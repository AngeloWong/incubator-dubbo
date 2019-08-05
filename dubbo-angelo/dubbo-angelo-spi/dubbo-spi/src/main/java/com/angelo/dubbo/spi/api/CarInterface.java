package com.angelo.dubbo.spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface CarInterface {

    @Adaptive("car")
    public void getColor(URL url);

    // 若如下所示，方法名上没有@Adaptive标识，则最终会抛出异常
    // throw new UnsupportedOperationException("method xxx of interface XXX is not adaptive method!")
//    public void getSize();
}
