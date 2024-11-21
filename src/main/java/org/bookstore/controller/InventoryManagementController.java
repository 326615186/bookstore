package org.bookstore.controller;

import lombok.extern.slf4j.Slf4j;
import org.bookstore.annotation.BaseResponse;
import org.bookstore.service.InventoryManagementService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@BaseResponse
@RequestMapping("/api/v1/inventory")
public class InventoryManagementController {

    @Resource
    InventoryManagementService inventoryManagementService;


}
