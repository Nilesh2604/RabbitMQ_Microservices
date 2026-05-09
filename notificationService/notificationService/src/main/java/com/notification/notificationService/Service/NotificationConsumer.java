package com.notification.notificationService.Service;
import com.notification.notificationService.Config.QueueConfig;
import com.notification.notificationService.Dto.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @RabbitListener(queues = QueueConfig.QUEUE)
    public void receiveOrder(Order order) {

        System.out.println("Order Received");

        System.out.println("Product: " + order.getProduct());

        System.out.println("Sending Email to: " + order.getEmail());

        System.out.println("Sending SMS to: " + order.getPhone());
    }
}
