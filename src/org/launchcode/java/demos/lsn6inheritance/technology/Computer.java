package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends AbstractEntity {

    private int ram;
    private int storage;
    private String manufacturer = "PineApple";

    public Computer(int ram, int storage) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ramToAdd) {
        this.ram = ram + ramToAdd;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = this.storage + storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
