/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Gi
 */
public class Quadrado extends Forma{
    protected float lado;

    public Quadrado(String nome, double area, float perimetro, float lado) {
        super(nome, area, perimetro);
        this.lado = lado;
    }

    //Polimorfismo: Sobreposição
    @Override
    public double area() {
        return lado*lado;
    }
    

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
    
}
