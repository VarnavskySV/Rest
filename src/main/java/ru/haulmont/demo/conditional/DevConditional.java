package ru.haulmont.demo.conditional;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Condition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "local".equals(context.getEnvironment().getProperty("meeting_type"));
    }

}
