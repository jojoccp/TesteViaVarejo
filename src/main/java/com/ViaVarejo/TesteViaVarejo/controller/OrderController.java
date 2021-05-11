package com.ViaVarejo.TesteViaVarejo.controller;

//import com.ViaVarejo.TesteViaVarejo.dto.OrderRequest;
import com.ViaVarejo.TesteViaVarejo.dto.OrderResponse;
//import com.ViaVarejo.TesteViaVarejo.dto.ProductRequest;
import com.ViaVarejo.TesteViaVarejo.model.Order;
import com.ViaVarejo.TesteViaVarejo.model.PaymentsConditions;
import com.ViaVarejo.TesteViaVarejo.model.Product;
//import com.ViaVarejo.TesteViaVarejo.service.OrderService;
import com.ViaVarejo.TesteViaVarejo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    public List<OrderResponse> createOrder(@RequestBody Order order) {

        return orderService.create(order);

    }


}
