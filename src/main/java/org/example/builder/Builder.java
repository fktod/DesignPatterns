package org.example.builder;

public interface Builder {
    public void buildRoom(int n);

    public void buildFloor(int m);

    public Building getResult();
}
