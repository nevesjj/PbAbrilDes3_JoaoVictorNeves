package com.PbAbrilDes3.mspayment.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class CalculateResponse {
    private BigDecimal total;
}
