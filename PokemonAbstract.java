public abstract class PokemonAbstract implements PokemonInterface {

    
    public Pokemon criaPokemon(String nome, String tipo, int saude) {
         return new Pokemon(nome, tipo, saude);
        
    }

    
    public void atacaPokemon(Pokemon pokemon) {
        System.out.println("O Pokémon atacou!");
        
    }

    
}
