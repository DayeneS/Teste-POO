// Arquivo Devs.java

// Classe Devs
public class Devs {
    // Atributos
    private String nome;
    private int experiencia; // em anos

    // Construtor
    public Devs(String nome, int experiencia) {
        this.nome = nome;
        this.experiencia = experiencia;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
