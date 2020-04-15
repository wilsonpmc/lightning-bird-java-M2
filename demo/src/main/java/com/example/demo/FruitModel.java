package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class FruitModel {
    public String id; // Id number for each fruit
    public String name; // Name of the fruit
    public String price; // Price of the fruit
}