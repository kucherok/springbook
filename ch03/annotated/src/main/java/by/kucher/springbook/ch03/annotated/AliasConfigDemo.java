package by.kucher.springbook.ch03.annotated;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

public class AliasConfigDemo {

    @Configuration
    public static class AliasBeanConfig {
        @Bean(name = { "asd", "asd1", "asd2", "asd3" })
        public Singer singer() {
            return new Singer();
        }
    }

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBeanConfig.class);

        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.entrySet().stream().forEach(b -> {
            String aliases = Arrays.toString(ctx.getAliases(b.getKey()));
            System.out.println("id: " + b.getKey() + "\n alises: " + aliases);
        });
        ctx.close();
    }

}
