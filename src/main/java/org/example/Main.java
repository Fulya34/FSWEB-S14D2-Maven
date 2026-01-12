package org.example;

import org.example.model.*;
import org.example.enums.*;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, PaintColor.WHITE);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp(LampType.NEON, true, 85);

        Wardrobe wardrobe = new Wardrobe(200, 180, 75.5);

        Carpet carpet = new Carpet(300, 200, PaintColor.RED);

        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling,
                bed,
                lamp,
                wardrobe,
                carpet
        );

        // 🔽 METOD TESTLERİ
        lamp.turnOn();
        bed.make();
        wardrobe.add();
        carpet.lying();
        ceiling.create();
        wall1.create();

        // 🔽 GETTER TESTLERİ
        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
    }
}
