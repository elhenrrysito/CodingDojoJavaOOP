package com.codingdojo.maestroobjetos;

import java.util.ArrayList;

public class Samurai extends Human {
    public static ArrayList<Samurai> howManySamurai = new ArrayList<Samurai>(); // constante arrayList para guardar lo samurai
    private int posicion = howManySamurai.size()+1; // para definir la posición del samurai


    public Samurai() {
        this.health = 200;
        howManySamurai.add(this);
    }

    public void deathBlow(Human human) {
        human.health = 0;
        this.health /=2;
    }

    public void meditate() {
        this.health += this.health/2;
    }

    public int howMany() {
        return posicion;
    }



}
