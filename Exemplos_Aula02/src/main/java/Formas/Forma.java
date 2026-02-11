/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Gi
 */
public abstract class Forma {

    private String nome;
    protected double area;
    public float perimetro;

    //Polimorfismo: Sobrecarga
    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double area();

    //Polimorfismo: Sobrecarga
    public Forma(String nome, double area, float perimetro) {
        this.nome = nome;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
