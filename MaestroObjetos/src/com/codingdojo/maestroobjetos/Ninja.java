package com.codingdojo.maestroobjetos;

public class Ninja extends Human {

    public Ninja() {
        this.stealth = 10;
    }

    public void stealHuman(Human human) {
        human.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway() {
        this.health -= 10;
    }
}
