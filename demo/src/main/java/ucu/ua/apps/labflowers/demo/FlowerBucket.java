package ucu.ua.apps.labflowers.demo;

import java.util.ArrayList;
import java.util.List;

import main.java.ucu.ua.apps.labflowers.demo.src.Rose;


public class FlowerBucket {

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack pack : flowerPacks) {
            sum += pack.getPrice();
        }
        return sum;
    }

    @Test
    void testTotalPrice() {
        Flower rose = new Rose(FlowerColor.RED, 40, 10);
        Flower tulip = new Tulip(FlowerColor.YELLOW, 20, 8);

        FlowerPack pack1 = new FlowerPack(rose, 5);
        FlowerPack pack2 = new FlowerPack(tulip, 10);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(pack1);
        bucket.addFlowerPack(pack2);

        assertEquals(400, bucket.getPrice());
    }
}
