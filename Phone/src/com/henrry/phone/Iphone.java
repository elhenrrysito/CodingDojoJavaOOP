package com.henrry.phone;

public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }


    @Override
    public String ring() {
        return "Iphone "+ getVersionNumber() + " says Zing";
    }

    @Override
    public String unlock() {
        return "Unlocking via facial reconigtion";
    }

    @Override
    public void displayInfo() {
        System.out.println("Iphone " + getVersionNumber() + " from " + getCarrier());
    }

}
