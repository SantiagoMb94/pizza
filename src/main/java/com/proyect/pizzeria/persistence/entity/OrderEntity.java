package com.proyect.pizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
//@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pizza_order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(name = "id_customer", nullable = false, length = 30)
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "timestamp")
    private LocalDateTime date;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double total;

    @Column(nullable = false, columnDefinition = "char(1)")
    private String method;

    @Column(name = "addsNotes", length = 200)
    private String addsNotes;

    @OneToOne
    @JoinColumn(name = "id_customer", referencedColumnName = "id_customer", insertable = false, updatable = false)
    private CustomerEntity customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItemEntity> items;
}
