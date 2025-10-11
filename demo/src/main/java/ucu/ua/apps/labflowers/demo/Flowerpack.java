package ucu.ua.apps.labflowers.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import main.java.ucu.ua.apps.labflowers.demo.src.Rose;

@Data
@AllArgsConstructor
public class Flowerpack {

    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    @Test
    void testGetPrice() {
        Flower rose = new Rose(FlowerColor.RED, 50, 10);
        FlowerPack pack = new FlowerPack(rose, 3);
        assertEquals(150, pack.getPrice());
    }

}
