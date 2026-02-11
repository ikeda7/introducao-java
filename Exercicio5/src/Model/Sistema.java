package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author lukin
 */
public class Sistema {
    public static ArrayList<Filme> filmes = new ArrayList<>();
    public static ArrayList<Livro> livros = new ArrayList<>();
    
    public static void cadastrarLivro(String nome, String descricao, int quantidade){
        livros.add(new Livro(nome, descricao, quantidade));
    }
    
    public static void cadastrarFilme(String titulo, String diretor, int ano){
        filmes.add(new Filme(titulo, diretor, ano));
    } 

    public static ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public static void setFilmes(ArrayList<Filme> filmes) {
        Sistema.filmes = filmes;
    }

    public static ArrayList<Livro> getLivros() {
        return livros;
    }

    public static void setLivros(ArrayList<Livro> livros) {
        Sistema.livros = livros;
    }
    
    public static String listarLivros(){
        String s = "";
        for (Livro l : livros){
            s += l.toString() + "\n";
        }
        return s;
    }
    
    public static String listarFilmes(){
        String s = "";
        for (Filme f : filmes){
            s += f.toString() + "\n";
        }
        return s;
    }
}
