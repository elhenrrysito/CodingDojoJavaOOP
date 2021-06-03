package com.henrry.zookeeperi.modelo;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        // Lanza tres cosas
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        // Come dos veces banana
        gorilla.eatBananas();
        gorilla.eatBananas();

        // Trepa un arbol
        gorilla.climb();

        int energyLevelGorilla = gorilla.displayEnergy();
    }
}
