package com.codingdojo.zookeeperii;

public class Bat extends Mammal {

    public void fly() {
        System.out.println("WRAAAA!! *volando*");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bueno, no importa...");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("WAASDASAAA LA CIUDAD QUEMANDOSE, MUAHAHAHHA!!!");
        energyLevel -= 100;
    }
}
