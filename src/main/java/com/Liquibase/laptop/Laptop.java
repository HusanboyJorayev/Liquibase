package com.Liquibase.laptop;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double price;
    private String model;
    private String colour;
}
