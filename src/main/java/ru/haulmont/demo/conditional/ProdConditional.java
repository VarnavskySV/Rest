package ru.haulmont.demo.conditional;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Condition;

import org.springframework.core.type.AnnotatedTypeMetadata;

public class ProdConditional implements Condition {
    
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "remote".equals(context.getEnvironment().getProperty("meeting_type"));
    }

}
