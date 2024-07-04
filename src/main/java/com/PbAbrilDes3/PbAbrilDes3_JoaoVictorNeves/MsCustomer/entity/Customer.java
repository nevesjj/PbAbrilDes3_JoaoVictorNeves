package com.PbAbrilDes3.PbAbrilDes3_JoaoVictorNeves.MsCustomer.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
@Entity
@Table (name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "cpf", nullable = false, unique = true, length = 20)
    @Size(min = 14, max = 14)
    private String cpf;
    @Column(name = "name", nullable = false, unique = false, length =  100)
    private String name;
    @Column(name = "gender", nullable = false, length = 20)
    private String gender;
    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;
    @NotBlank
    @Column(name = "email", nullable = false, unique = true, length =  100)
    private String email;
    @Column(name = "points")
    private int points;



}
