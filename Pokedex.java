public class Pokedex {
    public Pokemon criaPokemon(String nome, String tipo, int saude) {
        return new Pokemon(nome, tipo, saude);
    }

    public void atacaPokemon(Pokemon pokemon) {
        System.out.println("Um ataque aconteceu! Reduzindo a saúde do Pokémon.");
        // Lógica para reduzir a saúde do Pokémon após o ataque
        // Isso depende da sua implementação específica
    }

    public void pokemonInfo(Pokemon pokemon) {
        System.out.println("Informações do Pokémon:");
        System.out.println("Nome: " + pokemon.getNome());
        System.out.println("Tipo: " + pokemon.getTipo());
        System.out.println("Saúde: " + pokemon.getSaude());
    }
}
