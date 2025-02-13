package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        // Pede o primeiro parâmetro.
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        // Pede o segundo parâmetro.
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            // Chama o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro informado.");
        }
    }
    // Método para contar os parâmetros passados.
    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
        // Válida se o paramUM é MAIOR que o paramDois e lança excção
        if (paramUm > paramDois) {
            throw new ParametrosInvalidosException();
        }

        // Inicia a contagem depois de fazer a subtração dos Parâmetros.
        int contagem = paramDois - paramUm;
        System.out.println("\nConta realizada para iniciar a CONTAGEM:");
        System.out.println(paramDois + " - " + paramUm + " = " + contagem);
        for (int num = 1; num <= contagem; num++) {
            System.out.println("Imprimindo o número [" + num + "].");
        }
    }
}
