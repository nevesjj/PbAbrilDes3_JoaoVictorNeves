package com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsPayment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "")
public class Payment implements Serializable {
    private Long id;

}
