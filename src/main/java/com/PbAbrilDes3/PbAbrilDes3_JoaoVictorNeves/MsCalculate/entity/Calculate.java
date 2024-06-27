package com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCalculate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
@Entity
@Table (name = "")
public class Calculate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "category", nullable = false, length = 50)
    private String category;
    @Column(name = "parity", nullable = false, length = 10)
    private int parity;

}
