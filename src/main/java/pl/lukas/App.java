package pl.lukas;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class App {

    public static void main(String[] args) {

        // BUILDER
        // new House("ul. Kursowa 2", 2, 3, 12);
        // new House().setAddress("ul. Kursowa").setFloorsNumber(2).setDoorsNumber(3).setWindowsNumber(12).createHouse();
        // new House .setAddress .setFloorNumber .setDoorsNumber . setWindowNumber

        House house = new House.HouseBuilder()
                .setAddress("ul. Szkolna 2")
                .setDoorsNumber(2)
                .setFloorsNumber(5)
                .setWindowsNumber(12)
                .build();

        // STATIC FACTORY METHODS
        // from, of, valueOf, instanceOf

        boolean isTrue = true;
//        new Boolean(isTrue); // this same as below
        Boolean.valueOf(isTrue);
    }
}