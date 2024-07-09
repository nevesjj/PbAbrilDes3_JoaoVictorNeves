package com.PbAbrilDes3.mspayment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CalculateRequest {
    private Long categoryId;
    private BigDecimal value;
}
