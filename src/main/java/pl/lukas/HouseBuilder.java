package pl.lukas;

public class HouseBuilder {
    private String address;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    public HouseBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public HouseBuilder setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
        return this;
    }

    public HouseBuilder setDoorsNumber(Integer doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;
    }

    public HouseBuilder setWindowsNumber(Integer windowsNumber) {
        this.windowsNumber = windowsNumber;
        return this;
    }

    public House createHouse() {
        return new House(address, floorsNumber, doorsNumber, windowsNumber);
    }
}