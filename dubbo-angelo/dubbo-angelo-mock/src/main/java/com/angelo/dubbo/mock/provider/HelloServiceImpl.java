package com.angelo.dubbo.mock.provider;


import com.angelo.dubbo.mock.api.HelloService;

import java.util.concurrent.TimeUnit;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String username) {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Hello, " + username;
    }
}
