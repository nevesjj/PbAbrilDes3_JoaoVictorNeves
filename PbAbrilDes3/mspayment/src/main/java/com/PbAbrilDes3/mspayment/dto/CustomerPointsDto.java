package com.PbAbrilDes3.mspayment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
public class CustomerPointsDto {

    private Long customerId;
    private int points;

}
