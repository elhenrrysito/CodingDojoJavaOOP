package com.codingdojo.maestroobjetos;

public abstract class Human {
    int strength = 3;
    int intelligence = 3;
    int stealth = 3;
    int health = 100;

    public void attack(Human human) {
        human.health -= this.strength;
    }

}
