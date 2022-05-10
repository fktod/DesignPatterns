package org.example.builder;

import java.util.List;

public interface Building {
    void addRooms(String room);
    void addFloors(String floor);
    List<String> getRooms();
    List<String> getFloors();
    void show();
}
