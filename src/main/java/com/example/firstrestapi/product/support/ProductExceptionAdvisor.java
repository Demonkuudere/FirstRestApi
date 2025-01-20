package com.example.firstrestapi.product.support;


import com.example.firstrestapi.product.support.exception.ProductNotFoundException;
import com.example.firstrestapi.shared.api.response.ErrorMessageResponse;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.slf4j.Logger;

@ControllerAdvice
public class ProductExceptionAdvisor {


    private static final Logger LOG = LoggerFactory.getLogger(ProductExceptionAdvisor.class);
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse productNotFound(Exception e){
        LOG.error(e.getMessage(), e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}
