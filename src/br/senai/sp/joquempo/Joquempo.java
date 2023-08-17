package br.senai.sp.joquempo;

import java.util.Random;
import java.util.Scanner;

public class Joquempo {

    public static void main(String[] args) {

        String nome;
        int decisaoJogador, decisaoMaquina;
        boolean continuar = true;

        Scanner teclado = new Scanner(System.in);

        Random random = new Random();

        while (continuar) {

            System.out.print("Digite seu nome: ");
            nome = teclado.next();
            System.out.print("Olá " + nome + ". Digite uma das decisões para jogarmos joquempo:\n" +
                    "1- Pedra\n" +
                    "2- Papel\n" +
                    "3- Tesoura\n" +
                    "Escolha a opção entre [1-3]: ");
            decisaoJogador = teclado.nextInt();

            decisaoMaquina = random.nextInt(3) + 1;

            String escolhaMaquina = "";

            switch (decisaoMaquina){
                case 1:
                    escolhaMaquina = "Pedra";
                    break;
                case 2:
                    escolhaMaquina = "Papel";
                    break;
                case 3:
                    escolhaMaquina = "Tesoura";
                    break;
            }

            System.out.println("A máquina escolheu: " + escolhaMaquina);

            if (decisaoJogador == decisaoMaquina) {
                continuar = false;
                System.out.println("Empate!");
            } else if ((decisaoJogador == 1 && decisaoMaquina == 3) ||
                    (decisaoJogador == 2 && decisaoMaquina == 1) ||
                    (decisaoJogador == 3 && decisaoMaquina == 2)) {
                continuar = false;
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Você perdeu!");
            }
        }

    }

}
