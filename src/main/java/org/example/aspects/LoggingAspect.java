package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.model.Comment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName + " will execute with the following arguments");
        for(Object arg: arguments){
            Comment c = (Comment) arg;
            logger.info("Argument Text: " + c.getText());
            logger.info("Argument Author: " + c.getAuthor());
        }
        Object returnedObject = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedObject.toString());
    }
}
