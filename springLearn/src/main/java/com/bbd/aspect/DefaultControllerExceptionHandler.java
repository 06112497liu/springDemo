package com.bbd.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Liuweibo
 * @version Id: DefaultControllerExceptionHandler.java, v0.1 2017/10/30 Liuweibo Exp $$
 */
@ControllerAdvice
public class DefaultControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        return "error";
    }

}
    
    