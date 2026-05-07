import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) throws Exception {
        int apaga, e;
        int[] numb = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numb.length; i++) {
            System.out.println("Digite um número: ");
            numb[i] = sc.nextInt();
        }
        System.out.println("Digite o número que deseja apagar: ");
        apaga = sc.nextInt();
        for(int i = 0; i < numb.length; i++) {
            if(numb[i] == apaga) {
                numb[i] = (Integer) null;
            }
        }
        for(int i = 0; i < numb.length; i++) {
            if(numb[i] == (Integer) null) {
                e = i;
                while(e < numb.length - 1) {
                    numb[e] = numb[e + 1];
                    e++;
                }
            }
        }
        numb[numb.length - 1] = (Integer) null;
        System.out.println("Números restantes: ");
        for(int i = 0; i < numb.length; i++) {
            if(numb[i] != (Integer) null) {
                System.out.println(numb[i]);
            }
        }
    }
}