package org.example;

import java.util.*;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Ordenando Números Pares e Ímpares");
        System.out.println("=================================");

        System.out.println("Informe a quantidade de números serão informados: ");
        int repeticao = scanner.nextInt();

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for(int i = 1; i<= repeticao;i++){
            System.out.println("Informe o "+i+"º número: ");
            int numero = scanner.nextInt();

            while(numero < 0) {
                System.out.println("Número inválido, tem que ser inteiro não negativo, informe novamente: ");
                numero = scanner.nextInt();
            }

            if(numero % 2 ==0){
                numerosPares.add(numero);
            }else{
                numerosImpares.add(numero);
            }
        }

        Collections.sort(numerosPares);
        Collections.sort(numerosImpares, Collections.reverseOrder());

        System.out.println("Segue números ordenados de pares para ímpares, sendo os pares em ordem crescente e ímpares " +
                "em ordem decrescente:");

        for(int pares : numerosPares){
            System.out.println(pares);
        }

        for(int impares : numerosImpares){
            System.out.println(impares);
        }
    }
}