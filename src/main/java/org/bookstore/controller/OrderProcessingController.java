package org.bookstore.controller;

import lombok.extern.slf4j.Slf4j;
import org.bookstore.annotation.BaseResponse;
import org.bookstore.service.OrderProcessingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@BaseResponse
@RequestMapping("/api/v1/order")
public class OrderProcessingController {

    @Resource
    OrderProcessingService orderProcessingService;


}
