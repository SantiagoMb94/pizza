package com.proyect.pizzeria.service;

import com.proyect.pizzeria.persistence.entity.PizzaEntity;
import com.proyect.pizzeria.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaEntity> getAll(){
        return this.pizzaRepository.findAll();
    }

    public PizzaEntity get(Integer idPizza){
        return this.pizzaRepository.findById(idPizza).orElse(null);
    }

    public PizzaEntity save(PizzaEntity pizza){
        return this.pizzaRepository.save(pizza);
    }

    public boolean exists(Integer idPizza){
        return this.pizzaRepository.existsById(idPizza);
    }

    public void delete(Integer idPizza){
        this.pizzaRepository.deleteById(idPizza);
    }
}
