package com.Rifa.v10.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
public class CampaingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    
    private String nameAward;
    private String description;

    private Double price;


    private List<Integer> winningNumbers;
    private int ticketQuantity;

    private int inicialQuantity;


    private List<Long> idUsersBuyers;


    private boolean isOnline;


    private List<Integer> generatedNumbers;


}
