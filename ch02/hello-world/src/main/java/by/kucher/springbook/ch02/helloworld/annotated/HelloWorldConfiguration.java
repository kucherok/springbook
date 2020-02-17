package by.kucher.springbook.ch02.helloworld.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.kucher.springbook.ch02.helloworld.decoupled.HelloWorldMessageProvider;
import by.kucher.springbook.ch02.helloworld.decoupled.MessageProvider;
import by.kucher.springbook.ch02.helloworld.decoupled.MessageRenderer;
import by.kucher.springbook.ch02.helloworld.decoupled.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
