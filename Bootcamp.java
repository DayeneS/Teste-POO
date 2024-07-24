// Arquivo Bootcamp.java

// Classe Bootcamp
public class Bootcamp {
    // Atributos
    private String nome;
    private int duracao; // em semanas

    // Construtor
    public Bootcamp(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
