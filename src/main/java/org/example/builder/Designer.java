package org.example.builder;

public class Designer {
    public Building designBuilding(Builder builder) {
        builder.buildBuilding();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildRoom(3);
        builder.buildRoom(4);
        builder.buildFloor(1);
        builder.buildFloor(2);
        return builder.getResult();
    }

    public Building designHighBuilding(Builder builder) {
        builder.buildBuilding();
        for (int i = 1; i <= 100; i++) {
            builder.buildRoom(i);
            if (i % 10 == 0) {
                builder.buildFloor(i / 10);
            }
        }
        return builder.getResult();
    }
}
