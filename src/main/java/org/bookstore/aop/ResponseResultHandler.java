package org.bookstore.aop;

import org.bookstore.annotation.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice(annotations = {BaseResponse.class})
public class ResponseResultHandler {



}
