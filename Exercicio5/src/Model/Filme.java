package Model;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lukin
 */
public class Filme  implements Serializable {
    public String titulo;
    public String diretor;
    public int ano;

    public Filme(String titulo, String diretor, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Filme:\n" + "Título: " + titulo + "\nDiretor: " + diretor + "\nAno: " + ano;
    }
    
    
}
