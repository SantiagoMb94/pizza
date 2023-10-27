package com.proyect.pizzeria.controller.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @Column(name = "id_customer", nullable = false, length = 20)
    private String idCustomer;

    @Column(nullable = false,length = 60)
    private String name;

    @Column(length = 100)
    private String address;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "phone_number", length = 30)
    private String phoneNumber;
}
