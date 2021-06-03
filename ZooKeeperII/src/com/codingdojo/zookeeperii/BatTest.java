package com.codingdojo.zookeeperii;

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();

        // atacar ciudad tres veces
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        // comer humanos dos veces
        bat.eatHumans();
        bat.eatHumans();

        // volar dos veces
        bat.fly();
        bat.fly();

        bat.displayEnergy();
    }
}
