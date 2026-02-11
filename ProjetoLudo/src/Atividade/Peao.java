/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade;

/**
 *
 * @author Lucas
 */
public class Peao {
    
    private String cor;
    private int posicao;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void mover(int quantidade) {
        this.posicao += quantidade;
    }

    public void voltarInicio() {
        this.posicao = 0;
    }
}
