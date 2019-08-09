package com.angelo.dubbo.mock.consumer;

import com.angelo.dubbo.mock.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();

        HelloService helloService = context.getBean("helloService", HelloService.class);

        String result = helloService.sayHello("Angelo");
        System.out.println("result ->>>" + result);
    }
}
