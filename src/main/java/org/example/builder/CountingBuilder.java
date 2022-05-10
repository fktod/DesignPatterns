package org.example.builder;

public class CountingBuilder implements Builder {
    private Building building;

    public CountingBuilder() {
        this.building = new CountingBuilding();
    }

    @Override
    public void buildRoom(int n) {
        if (n < 10) {
            building.addRooms(85.2 + "");
        } else if (10 <= n && n < 50) {
            building.addRooms(62.2 + "");
        } else {
            building.addRooms(48.7 + "");
        }
    }

    @Override
    public void buildFloor(int m) {
        if (m < 4) {
            building.addFloors(245.0 + "");
        } else if (4 <= m && m < 12) {
            building.addFloors(278.0 + "");
        } else {
            building.addFloors(297.0 + "");
        }
    }

    @Override
    public Building getResult() {
        return building;
    }
}
