package pl.lukas.models;

import pl.lukas.House;

public class FamilyHouse {

    private String address;
    private Integer floorsNumber;

    public FamilyHouse(String address, Integer floorsNumber) {
        this.address = address;
        this.floorsNumber = floorsNumber;
    }

    public static FamilyHouse from(House house) {
        return new FamilyHouse(house.getAddress(), house.getFloorsNumber());
    }
}
