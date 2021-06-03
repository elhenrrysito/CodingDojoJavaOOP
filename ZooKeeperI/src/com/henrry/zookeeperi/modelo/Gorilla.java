package com.henrry.zookeeperi.modelo;

public class Gorilla extends Mammal {

    public void throwSomething() {
        System.out.println("Gorila ha lanzado algo!!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Que ricas son las bananas!!");
        energyLevel += 5;
    }

    public void climb() {
        System.out.println("He trepado sobre un árbol!!!");
        energyLevel -= 10;
    }
}
