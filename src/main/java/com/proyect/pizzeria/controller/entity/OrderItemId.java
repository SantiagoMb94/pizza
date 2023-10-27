package com.proyect.pizzeria.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemId {

    private Integer idOrder;
    private Integer idItem;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof OrderItemId that))return false;
        return Objects.equals(idOrder, that.idOrder) && Objects.equals(idItem, that.idItem);
    }

    @Override
    public  int hashCode(){
        return Objects.hashCode(idOrder);
    }
}
