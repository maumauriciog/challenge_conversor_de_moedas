package br.com.challenge.conversordemoedas.principal;

import br.com.challenge.conversordemoedas.modelos.ConvertCurrency;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        ConvertCurrency convert = new ConvertCurrency();
        int option = 0;

        while (option != 7) {
            System.out.print("-----------------------------------------");
            System.out.println("\n------------ SEJA BEM VINDO -------------");
            System.out.println("---------- CONVERSOR DE MOEDAS ---------- ");
            System.out.println("-----------------------------------------\n");
            System.out.println("1). Dolar           -> Peso Argentino");
            System.out.println("2). Peso Argentino  -> Dolar");
            System.out.println("3). Dolar           -> Real Brasileiro");
            System.out.println("4). Real Brasileiro -> Dolar");
            System.out.println("5). Dolar           -> Peso Colombiano");
            System.out.println("6). Peso Colombiano -> Dolar");
            System.out.println("7). Sair\n");

            try {
                System.out.print("-> Escolha uma opção válida: ");
                option = imput.nextInt();

                if (option >= 7) {
                    System.out.println("**** Programa de Conversor de Moedas Finalizado ****");
                    break;
                }

                System.out.print("-> Digite o valor que deseja converter: ");
                double amount = imput.nextInt();

                if ((option <= 0) | (option > 7)) {
                    System.out.println("\n*** Opção Inválida! Repita a Operação ***\n");
                }
                switch (option) {
                    case 1:
                        convert.Currency("USD", "ARS", amount);
                        break;
                    case 2:
                        convert.Currency("ARS", "USD", amount);
                        break;
                    case 3:
                        convert.Currency("USD", "BRL", amount);
                        break;
                    case 4:
                        convert.Currency("BRL", "USD", amount);
                        break;
                    case 5:
                        convert.Currency("USD", "COP", amount);
                        break;
                    case 6:
                        convert.Currency("COP", "USD", amount);
                        break;
                }
            } catch (InputMismatchException i) {
                System.out.println("\n*** Você digitou valores INCORRETOS, por favor execute novamente o programa...***");
                break;
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
