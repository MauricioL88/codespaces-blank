package colecoes.map;

public class Piloto {
    String nome;
    int idade;
    String nacionalidade;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "[Nome: " + nome + ", Idade: " + idade + ", Nacionalidade: " + nacionalidade+"] ";
    }
}