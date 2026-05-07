package com.orderService.Controller;


import com.orderService.Dto.Order;
import com.orderService.Service.OrderProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer producer;

    public OrderController(OrderProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String placeOrder(@RequestBody Order order) {

        producer.sendOrder(order);

        return "Order placed successfully";
    }
}
