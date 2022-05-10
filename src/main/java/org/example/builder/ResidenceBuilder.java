package org.example.builder;

public class ResidenceBuilder implements Builder{
    private Building building;

    public ResidenceBuilder() {
        this.building = new ResidenceBuilding();
    }

    @Override
    public void buildRoom(int n) {
        building.addRooms(n+"号房间");
    }

    @Override
    public void buildFloor(int m) {
        building.addFloors(m+"层");
    }

    @Override
    public Building getResult() {
        return building;
    }
}
