package com.codingdojo.maestroobjetos;

public class Wizard extends Human {

    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    public void healHuman(Human human) {
        human.health += this.intelligence;
    }

    public void fireballHuman(Human human) {
        human.health -= this.intelligence*3;
    }


}
