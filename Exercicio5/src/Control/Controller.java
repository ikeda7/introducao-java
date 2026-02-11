/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Filme;
import Model.Livro;
import Model.Sistema;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author lukin
 */
public class Controller {
    public ArrayList<Filme> lerArquivoFilmes() throws FileNotFoundException, IOException, ClassNotFoundException {
        boolean cont = true;
            ArrayList<Filme> filmes = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(new File("data/filmes.txt"));
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;
                  
                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             filmes = ((ArrayList<Filme>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e) {
                
            }
            return filmes;
    }
    
    public ArrayList<Livro> lerArquivoLivros() throws FileNotFoundException, IOException, ClassNotFoundException {
        boolean cont = true;
            ArrayList<Livro> livros = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(new File("data/livros.txt"));
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;
                  
                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             livros = ((ArrayList<Livro>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e) {
                
            }
            return livros;
    }
    
    public static void escreverFilmes(ArrayList<Filme> filmes) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("data/filmes.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(filmes);
         oos.flush();
         oos.close();
    }
    
    public void escreverLivros(ArrayList<Livro> livros) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("data/livros.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(livros);
         oos.flush();
         oos.close();
    }
    
    public void atualizarArquivos() throws IOException, FileNotFoundException, ClassNotFoundException{
        escreverLivros(Sistema.getLivros());
        escreverFilmes(Sistema.getFilmes());
    }
    
    public void atualizarSistema() throws IOException, FileNotFoundException, ClassNotFoundException{
        Sistema.setFilmes(lerArquivoFilmes());
        Sistema.setLivros(lerArquivoLivros());
    }
    
    public void cadastrarLivro(String nome, String descricao, int quantidade) throws IOException, FileNotFoundException, ClassNotFoundException{
        Sistema.cadastrarLivro(nome, descricao, quantidade);
        atualizarArquivos();
    }
    
    public void cadastrarFilme(String titulo, String diretor, int ano) throws IOException, FileNotFoundException, ClassNotFoundException{
        Sistema.cadastrarFilme(titulo, diretor, ano);
        atualizarArquivos();
    }
    
    public String listarFilmes(){
        return Sistema.listarFilmes();
    }
    
    public String listarLivros(){
        return Sistema.listarLivros();
    }
}
