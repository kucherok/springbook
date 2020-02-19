package by.kucher.springbook.ch03.annotated;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnotatedBeanNaming {

    public static void main(String... arg) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotated.xml");
        ctx.refresh();

        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.entrySet().stream().forEach(b -> System.out.println("id: " + b.getKey()));
        ctx.close();
    }

}
