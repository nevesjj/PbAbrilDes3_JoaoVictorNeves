package com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsPayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;
    @Column(name = "customer_id", nullable = false)
    private int customer_id;
    @Column(name = "category_id", nullable = false)
    private int category_id;
    @Column(name = "total", nullable = false)
    private int total;
    @Column(name = "created_date", nullable = false)
    private LocalDate created_date;


}
