package com.henrry.pokemon;


import java.util.ArrayList;

public class PokeDex extends AbstractPokemon {
    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<Pokemon>();
    private int myPokemons;

    public PokeDex() {
    }

    public int getMyPokemons() {
        return myPokemons;
    }

    @Override
    public void listPokemon() {
        for(Pokemon pokemon : pokemonArrayList) {
            System.out.println(super.pokemonInfo(pokemon));
        }
    }

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = super.createPokemon(name, health, type);
        pokemonArrayList.add(pokemon);
        myPokemons++;
        return pokemon;
    }

    public void fightPokemon() {
        Pokemon pokemonUno = pokemonArrayList.get(0);
        Pokemon pokemonDos = pokemonArrayList.get(1);
        pokemonUno.attackPokemon(pokemonDos);
        System.out.println(super.pokemonInfo(pokemonDos));
    }
}
