package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer {

    private boolean indestructible;

    public Laptop(int ram, int storage, boolean indestructible) {
        super(100, 100);
        this.indestructible = true;
    }
}
