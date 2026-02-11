/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Gi
 */
public class Triangulo extends Forma{
    public float base;
    public float altura;

    public Triangulo(String nome) {
        super(nome);
    }

    //Polimorfismo: Sobreposição e Sobrecarga
    @Override
    public double area() {
        return base*altura/2;
    }
    
    //Polimorfismo: Sobreposição e sobrecarga
    
    public double area(float base, float altura){
        return base*altura/2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
