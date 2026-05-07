package com.notification.notificationService.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int orderId;
    private String product;
    private String email;
    private String phone;
}
