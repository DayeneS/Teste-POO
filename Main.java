// Arquivo Main.java

public class Main {
    public static void main(String[] args) {
        // Criando objetos das classes
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Java", 12);
        Curso curso = new Curso("Curso de Algoritmos", 60);
        Mentoria mentoria = new Mentoria("João Silva", "Desenvolvimento Web");
        Devs dev1 = new Devs("Ana Souza", 3);
        Devs dev2 = new Devs("Carlos Oliveira", 5);

        // Relacionando os objetos
        bootcamp.setCurso(curso);
        bootcamp.addMentoria(mentoria);
        bootcamp.addDevs(dev1);
        bootcamp.addDevs(dev2);

        // Exibindo informações
        System.out.println("Informações do Bootcamp:");
        System.out.println(bootcamp);

        System.out.println("\nInformações do Curso:");
        System.out.println(curso);

        System.out.println("\nInformações da Mentoria:");
        System.out.println(mentoria);

        System.out.println("\nInformações dos Devs no Bootcamp:");
        for (Devs dev : bootcamp.getDevs()) {
            System.out.println(dev);
        }
    }
}

