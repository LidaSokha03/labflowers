package ucu.ua.apps.labflowers.demo;

import main.java.ucu.ua.apps.labflowers.demo.src.Rose;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Rose(FlowerColor.RED, 70, 10);

        System.out.println("Flower type: " + rose.getFlowerType());
        System.out.println("Color: " + rose.getColor());
        System.out.println("Price: " + rose.getPrice());
        System.out.println("Sepal length: " + rose.getSepalLength());
        System.out.println(rose);
    }

     @Test
    void testFlowerCreation() {
        Flower rose = new Rose(FlowerColor.RED, 70, 10);
        assertEquals(FlowerColor.RED, rose.getColor());
        assertEquals(70, rose.getPrice());
        assertEquals(10, rose.getSepalLength());
        assertEquals(FlowerType.ROSE, rose.getFlowerType());
    }
}
