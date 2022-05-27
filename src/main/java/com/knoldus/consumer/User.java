package com.knoldus.consumer;

import com.knoldus.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.knoldus.config.MessagingConfig;

@Component
public class User {

	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus){
		System.out.println("Message received from Queue "+ orderStatus);
	}
	
}
