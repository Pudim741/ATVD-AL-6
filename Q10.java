import java.util.Scanner;
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome  = nome;
        this.idade = idade;
    }

    public String getNome()  { return nome;  }
    public int    getIdade() { return idade; }
}

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[10];

        // ── 1. preencher o vetor ──────────────────────
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("  Nome: ");
            String nome = sc.nextLine();

            System.out.print("  Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
        }

        // ── 2. encontrar a pessoa mais velha ──────────
        Pessoa maisVelha = pessoas[0];

        for (int i = 1; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoas[i];
            }
        }

        // ── 3. exibir o resultado ────────────────────
        System.out.println("\nPessoa mais velha");
        System.out.println("Nome : " + maisVelha.getNome());
        System.out.println("Idade: " + maisVelha.getIdade());
    }
}

