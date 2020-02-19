package by.kucher.springbook.ch03.annotated;

import org.springframework.core.annotation.AliasFor;

public @interface Award {

    @AliasFor("prize")
    String[] value() default {};

    @AliasFor("value")
    String[] prize() default {};

}
