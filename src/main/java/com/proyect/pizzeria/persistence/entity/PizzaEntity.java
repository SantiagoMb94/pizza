package com.proyect.pizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
//@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pizza")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(nullable = false,length = 30,unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = false, columnDefinition = "Decimal(5,2)")
    private Double price;

    @Column(columnDefinition = "boolean")
    private Boolean vegetarian;

    @Column(columnDefinition = "boolean")
    private Boolean vegan;

    @Column(columnDefinition = "boolean", nullable = false)
    private Boolean available;
}

