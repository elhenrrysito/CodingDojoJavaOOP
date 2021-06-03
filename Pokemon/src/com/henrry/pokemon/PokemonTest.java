package com.henrry.pokemon;

public class PokemonTest {
    public static void main(String[] args) {
        PokeDex pokedex = new PokeDex();

        pokedex.createPokemon("Charmander", 500, "Fire");
        pokedex.createPokemon("Pikachu", 500, "Rayo");
        pokedex.fightPokemon();
        int cantidadPokemonPokedex = pokedex.getMyPokemons();
        System.out.println("Cantidad pokemones: " + cantidadPokemonPokedex);
    }


}
