import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) throws Exception {
        String verf;
        String[] nomes = new String[10];
        String[] nomesInvert = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Escreva o nome:");
            nomes[i] = sc.nextLine();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nEscreva o nome para verificar:");
            verf = sc.next();
            if(nomes[i].equals(verf)){
                nomes[i] = null;
                break;
            }
        }
    }
}

