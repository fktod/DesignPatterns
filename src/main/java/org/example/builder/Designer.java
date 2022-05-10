package org.example.builder;

public class Designer {
    private Builder builder;

    public Designer(Builder builder) {
        this.builder = builder;
    }

    public Building build() {
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildRoom(3);
        builder.buildRoom(4);
        builder.buildFloor(1);
        builder.buildFloor(2);
        return builder.getResult();
    }

    public Building buildHigh() {
        for (int i = 1; i <= 100; i++) {
            builder.buildRoom(i);
            if (i % 10 == 0) {
                builder.buildFloor(i / 10);
            }
        }
        return builder.getResult();
    }
}
