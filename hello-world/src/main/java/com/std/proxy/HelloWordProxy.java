package com.std.proxy;

import com.std.api.IHelloWorld;
import org.springframework.stereotype.Component;

/**
 * @ file_name HelloWordProxy
 * @ author  sence (lovesenceqi@gmail.com)
 * @ date 2015/4/4 16:01
 * @ description
 * @ review by
 */
@Component("helloWorld")
public class HelloWordProxy implements IHelloWorld {


    @Override
    public String sayHello(String name) {
        return  "Hello "+name;
    }
}
