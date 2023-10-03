public interface PokemonInterface {
    Pokemon criaPokemon(String nome, String tipo, int saude);
    void atacaPokemon(Pokemon pokemon);
    void pokemonInfo(Pokemon pokemon);
}
