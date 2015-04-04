package com.std;

import com.std.api.IHelloWorld;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ file_name DubboTest
 * @ author  sence (lovesenceqi@gmail.com)
 * @ date 2015/4/4 16:40
 * @ description
 * @ review by
 */
public class DubboTest {


    @Test
    public void start() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/hw-provider.xml","/META-INF/spring/applicationContext-hw.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }

    @Test
    public void testInvoker(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/hw-consumer.xml"});
        context.start();
        IHelloWorld helloWorld = (IHelloWorld)context.getBean("helloService");
        String hws = helloWorld.sayHello("dubbo");
        System.out.println(hws);
    }

}
