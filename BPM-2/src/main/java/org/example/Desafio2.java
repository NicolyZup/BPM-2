package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        Conversão de Tempo       ");
        System.out.println("=================================");

        System.out.println("Informe o valor em segundos para conversão: ");
        long segundos = scanner.nextLong();

        Date data = new Date(segundos*1000);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        dataFormatada.setTimeZone(TimeZone.getTimeZone("GMT"));

        String dataSaida = dataFormatada.format(data);
        System.out.println("Segue a conversão dos segundos "+segundos+" para data (dd/mm/yyyy HH:mm:ss): ");
        System.out.println(dataSaida);
    }
}