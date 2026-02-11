/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplos_aula02;

/**
 *
 * @author Gi
 */

class Circulo {
    float raio;
    double circunferencia;
    
    static final String Formato = "REDONDO";

   //Construtor
    public Circulo(float raio, double circunferencia) {
        this.raio = raio;
        this.circunferencia = circunferencia;
    }

       
    final double  areaCirculo () {
        return Math.PI * raio * raio;
    }
}

