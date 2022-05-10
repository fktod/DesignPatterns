package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class ResidenceBuilding implements Building {
    List<String> rooms;
    List<String> floors;

    public ResidenceBuilding() {
        this.rooms = new ArrayList<>();
        this.floors = new ArrayList<>();
    }

    @Override
    public void addRooms(String room) {
        rooms.add(room);
    }

    @Override
    public void addFloors(String floor) {
        floors.add(floor);
    }

    @Override
    public List<String> getRooms() {
        return rooms;
    }

    @Override
    public List<String> getFloors() {
        return floors;
    }

    @Override
    public void show() {
        System.out.println("住宅房间：" + rooms.toString() + "；" +
                "楼层：" + floors.toString() + "。");
    }
}
