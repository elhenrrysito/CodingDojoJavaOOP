package com.codingdojo.maestroobjetos;

public class HumanTest {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Samurai samuraiDos = new Samurai();
        Samurai samuraiTres = new Samurai();
        Samurai samuraiCuatro = new Samurai();
        Samurai samuraiCinco = new Samurai();
        Wizard wizard = new Wizard();

        wizard.fireballHuman(ninja); // atacando al ninja
        System.out.println("Salud ninja: " + ninja.health);
        wizard.healHuman(ninja); // curando al ninja
        System.out.println("Salud samurai: " + ninja.health);
        wizard.fireballHuman(samurai);

        ninja.stealHuman(wizard); // robamos salud del mago
        System.out.println("Salud wizard: " + wizard.health);
        System.out.println("Salud ninja: " + ninja.health);
        ninja.runAway(); // el ninja corre
        System.out.println("Salud ninja: " + ninja.health);

        samurai.deathBlow(samuraiDos);
        System.out.println("Salud samurai asesinado:" + samuraiDos.health);
        System.out.println("Salud samurai asesino:" + samurai.health);

        int howManySamurai = samurai.howMany(); // posicion 1 samurai

        System.out.println(howManySamurai);

    }
}
