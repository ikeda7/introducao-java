/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplos_aula02;

import Formas.Forma;
import Formas.Quadrado;
import Formas.Triangulo;
import Formas.Circulo;

/**
 *
 * @author Gi
 */
public class Exemplos_POO {

    public static void main(String[] args) {
        System.out.println("Aoba");

        //Criando e instanciando os objetos
        Circulo c1 = new Circulo("C1");
        c1.raio = 10.0f;
        Quadrado q1 = new Quadrado("Q1", 25.0f, 20.0f, 5.0f);
        Triangulo t1 = new Triangulo("T1");
        
        //Imprimir as informações do Círculo
        System.out.println("\nNome: " +  c1.getNome());
        System.out.println("Raio: " + c1.raio);
        System.out.println("Area: " + c1.area());
        
        //Imprimir as informações do Quadrado
        System.out.println("\nNome: " +  q1.getNome());
        System.out.println("Lado: " + q1.getLado());
        System.out.println("Area: " + q1.area());
        System.out.println("Perimetro: " + q1.perimetro);
        
        //Imprimir as informações do Triângulo
        System.out.println("\nNome: " + t1.getNome());
        t1.base = 5.0f;
        t1.altura = 10.0f;
        System.out.println("Base: " + t1.getBase());
        System.out.println("Altura: " + t1.getAltura());
        System.out.println("Area: " + t1.area());
        
        //Exemplo de Upcasting
        Forma f1 = new Quadrado("Q2", 4.0f, 8.0f, 2.0f);
        System.out.println("\nNome: " + f1.getNome());
        System.out.println("Area: " + f1.area());
        
        //Exemplo de Downcasting
        Forma f2 = new Circulo("C2");
        if(f2 instanceof Circulo){
            Circulo c2 = (Circulo) f2;
            c2.raio = 5.0f;
            System.out.println("\nNome: " + c2.getNome());
            System.out.println("Raio: " + c2.raio);
            System.out.println("Area: " + c2.area());
        }
        
        
    }
}
