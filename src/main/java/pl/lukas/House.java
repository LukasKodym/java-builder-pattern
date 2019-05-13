package pl.lukas;

public class House {

    private String address;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    public House(String address, Integer floorsNumber, Integer doorsNumber, Integer windowsNumber) {
        this.address = address;
        this.floorsNumber = floorsNumber;
        this.doorsNumber = doorsNumber;
        this.windowsNumber = windowsNumber;
    }
}
