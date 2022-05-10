package org.example.builder;

import java.util.List;

public class CountingBuilding implements Building {
    private double countingRooms;
    private double countingFloors;

    public CountingBuilding() {
        this.countingRooms = 0;
        this.countingFloors = 0;
    }

    @Override
    public void addRooms(String room) {
        countingRooms += Double.parseDouble(room);
    }

    @Override
    public void addFloors(String floor) {
        countingFloors += Double.parseDouble(floor);
    }

    @Override
    public List<String> getRooms() {
        return null;
    }

    @Override
    public List<String> getFloors() {
        return null;
    }

    @Override
    public void show() {
        System.out.println("造价为：" + (countingRooms + countingFloors));
    }
}
