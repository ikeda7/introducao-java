/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplos_aula02;

import Formas.Circulo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gi
 */
public class Exemplos_Aula02 {

    public static void main(String[] args) {

        //Converte texto para inteiro
        int n = Integer.parseInt("10");

        //Encontra o valor máximo
        Integer max = Integer.max(20, 74);

        //Pode ser instanciado sem um 'construtor'
        float valor = 15.6f;

        System.out.println(n);
        System.out.println(max);
        System.out.println(valor);

        Circulo c1 = new Circulo("C1");
        c1.perimetro = 12;
        System.out.println(c1.perimetro);

        double area = c1.area();
        System.out.println(area
        );

        c1.raio = 3;
        area = c1.area();
        System.out.println(area);
        float idade = 5;

        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");

        int dia = scanner.nextInt();

        switch (dia) {
            case 1 ->
                System.out.println("Domingo");
            case 2 ->
                System.out.println("Segunda-feira");
            case 3 ->
                System.out.println("Terça-feira");
            case 4 ->
                System.out.println("Quarta-feira");
            case 5 ->
                System.out.println("Quinta-feira");
            case 6 ->
                System.out.println("Sexta-feira");
            case 7 ->
                System.out.println("Sábado");
            default ->
                System.out.println("Número inválido");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int numero : numeros) {
            System.out.println(numero);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        System.out.println("Acordem");
        System.out.println("Para");
        System.out.print("Aula");
        System.out.print("!!!");

    }
}
