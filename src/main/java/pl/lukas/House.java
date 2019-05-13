package pl.lukas;

public class House {

    private String address;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    public House() {
    }

    public House setAddress(String address) {
        this.address = address;
        return this;
    }

    public House setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
        return this;

    }

    public House setDoorsNumber(Integer doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;

    }

    public House setWindowsNumber(Integer windowsNumber) {
        this.windowsNumber = windowsNumber;
        return this;

    }
}
