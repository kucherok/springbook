package by.kucher.springbook.ch02.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.kucher.springbook.ch02.helloworld.decoupled.MessageRenderer;

public class HelloWorldSpringDI {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }

}
