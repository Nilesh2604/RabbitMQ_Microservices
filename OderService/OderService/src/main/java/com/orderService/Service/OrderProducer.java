package com.orderService.Service;


import com.orderService.Config.QueueConfig;
import com.orderService.Dto.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    private final RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrder(Order order) {

        rabbitTemplate.convertAndSend(
                QueueConfig.QUEUE,
                order
        );

        System.out.println("Order Sent: " + order.getProduct());
    }
}
