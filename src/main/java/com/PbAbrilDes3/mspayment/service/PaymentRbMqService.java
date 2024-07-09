package com.PbAbrilDes3.mspayment.service;

import com.PbAbrilDes3.mspayment.dto.CustomerPointsDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentRbMqService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void updatePoints(CustomerPointsDto customerPointsDto) {
        rabbitTemplate.convertAndSend("paymentQueue", "{'customerId':'"+customerPointsDto.getCustomerId()+"','points':"+customerPointsDto.getPoints()+"}");
    }
}
