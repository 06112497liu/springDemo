package com.bbd.aspect;

import com.bbd.exception.ApplicationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Liuweibo
 * @version Id: DefaultControllerExceptionHandler.java, v0.1 2017/10/30 Liuweibo Exp $$
 */
@ControllerAdvice
public class DefaultControllerExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public String applicationExceptionHandler(ApplicationException e) {
        return "error";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        return "error";
    }

}
    
    