// Arquivo Mentoria.java

// Classe Mentoria
public class Mentoria {
    // Atributos
    private String nomeMentor;
    private String area;

    // Construtor
    public Mentoria(String nomeMentor, String area) {
        this.nomeMentor = nomeMentor;
        this.area = area;
    }

    // Métodos
    public String getNomeMentor() {
        return nomeMentor;
    }

    public void setNomeMentor(String nomeMentor) {
        this.nomeMentor = nomeMentor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "nomeMentor='" + nomeMentor + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
