import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) throws Exception {
        int e = 0;
        String[] nomes = new String[10];
        String[] nomesInvert = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Escreva o nome:");
            nomes[i] = sc.nextLine();
        }
        for (int i = nomes.length; i != -1; i--) {
            nomesInvert[i] = nomes[e];
            e++;
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nOs nomes escritos foram: " + nomesInvert[i]);
        }
    }
}
