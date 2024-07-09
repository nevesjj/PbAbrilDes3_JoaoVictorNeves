package com.PbAbrilDes3.mspayment.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor
public class PaymentRequest {

    private Long customerId;
    private BigDecimal total;
    private Long categoryId;


}
