package org.launchcode.java.demos.lsn6inheritance.technology;

public class SmartPhone extends Computer {

    private boolean holographic;

    public SmartPhone(int ram, int storage, boolean holographic) {
        super(100, 100);
        this.holographic = true;
    }
}
