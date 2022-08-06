package main.java.ngntuli.chapter08;

import main.java.ngntuli.chapter07.Oblong;

import java.util.ArrayList;

public class Apartment {
    private final ArrayList<Oblong> rooms = new ArrayList<>();

    public void addRoom(Oblong room) {
        rooms.add(room);
    }

    public double getRoomLength(int roomNumber) {
        if (rooms.size() >= roomNumber) {
            return rooms.get(roomNumber - 1).getLength();
        } else {
            return -999;
        }
    }

    public double getRoomHeight(int roomNumber) {
        if (rooms.size() >= roomNumber) {
            return rooms.get(roomNumber - 1).getHeight();
        } else {
            return -999;
        }
    }

    public double getRoomArea(int roomNumber) {
        if (rooms.size() >= roomNumber) {
            return rooms.get(roomNumber - 1).calculateArea();
        } else {
            return -999;
        }
    }

    public double getRoomParameter(int roomNumber) {
        if (rooms.size() >= roomNumber) {
            return rooms.get(roomNumber - 1).calculatePerimeter();
        } else {
            return -999;
        }
    }
}
