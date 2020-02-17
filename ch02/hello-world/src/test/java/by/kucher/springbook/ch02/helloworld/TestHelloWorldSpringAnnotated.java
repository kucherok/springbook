package by.kucher.springbook.ch02.helloworld;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import by.kucher.springbook.ch02.helloworld.annotated.HelloWorldConfiguration;
import by.kucher.springbook.ch02.helloworld.decoupled.MessageRenderer;

class TestHelloWorldSpringAnnotated {

    @org.junit.jupiter.api.Test
    public void testHello() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa");
        System.out.println(mr);
        assertNotNull(mr);
    }

}
