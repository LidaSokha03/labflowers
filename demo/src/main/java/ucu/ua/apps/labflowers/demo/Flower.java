package ucu.ua.apps.labflowers.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Flower {
    private FlowerColor color;
    private double price;
    private double sepalLength;
    private FlowerType flowerType;
}
