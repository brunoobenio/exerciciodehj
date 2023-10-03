public class TestePokemon {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Pokemon bulbasauro = pokedex.criaPokemon("bulba", "Bulbasauro", 100);

        pokedex.pokemonInfo(bulbasauro);
        pokedex.atacaPokemon(bulbasauro);

        // Imprima novamente as informações após o ataque
        pokedex.pokemonInfo(bulbasauro);
    }
}