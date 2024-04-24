package com.microservices.order.service.controller;

import com.microservices.order.service.dto.OrderRequest;
import com.microservices.order.service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeorder(@RequestBody OrderRequest orderRequest) {
         return orderService.placeOrder(orderRequest);
    }
}
