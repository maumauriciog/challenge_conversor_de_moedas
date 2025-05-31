import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7){
            System.out.println("\n-----------------------------------------");
            System.out.println("---------- CONVERSOR DE MOEDAS ---------- ");
            System.out.println("-----------------------------------------\n");
            System.out.println("1). Dolar           -> Peso Argentino");
            System.out.println("2). Peso Argentino  -> Dolar");
            System.out.println("3). Dolar           -> Real Brasileiro");
            System.out.println("4). Real Brasileiro -> Dolar");
            System.out.println("5). Dolar           -> Peso Colombiano");
            System.out.println("6). Peso Colombiano -> Dolar");
            System.out.println("7). Sair\n");
            System.out.print("-> Escolha uma opção válida: ");
            opcao = imput.nextInt();

            if (opcao <= 0 || opcao > 7){
                System.out.println("\n*** Opção Inválida! Repita a Operação ***\n");
            }


        }

    }
}
