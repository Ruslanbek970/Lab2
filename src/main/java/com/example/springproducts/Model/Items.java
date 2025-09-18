package com.example.springproducts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // включает геттеры, сеттеры, toString
@AllArgsConstructor // конструктор со всеми полями
@NoArgsConstructor  // конструктор без аргументов
public class Items {
    private Long id;
    private String name;
    private String description;
    private double price;
}
