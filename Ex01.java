package edu.marcella.matematica;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        //Instancia um novo número randomico
        Random rand = new Random();
        //Instancia um novo scanner para entrada de informação
        Scanner sc = new Scanner(System.in);

        //Número sorteado aleatoriamente até 1000
        int sort = rand.nextInt(1000);

        //Entrada do número palpite
        System.out.println("Digite seu palpite: ");
        int palp = sc.nextInt();

        //Inicializa a quantidade de tentativas
        int tentativas = 1;

        do{
            //Condição
            if (palp > sort)
                System.out.println("O palpite é maior que o número sorteado, tente novamente.");
             else
                System.out.println("O palpite é menor que o número sorteado, tente novamente");
            //Lê novamente o palpite
            palp = sc.nextInt();
            //A cada palpite, um numero de tentativa
            tentativas++;

        }while (palp != sort); //Enquanto o usuário errar, o código irá rodar

        //Ao acertar, ele mostra em quantas tentativas você acertou, e qual foi o num sorteado.
        System.out.println("Parabéns, você acertou em "+ tentativas +" tentativas. O número sorteado foi "+sort);

        sc.close();
    }
}