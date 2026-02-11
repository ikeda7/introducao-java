/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade;

import java.util.Random;

/**
 *
 * @author Lucas
 */
public class Jogo {
    
    private Peao[] peoes;
    private Random random;
    
    public Jogo() {
        this.peoes = new Peao[8];
        for (int i = 0; i < 8; i++) {
            this.peoes[i] = new Peao();
        }
        this.random = new Random();
    }
    
    public void checarColisao(Peao peao) {
        int posicao = peao.getPosicao();
        int cont = 0;
        for (Peao p : peoes) {
            if (p.getPosicao() == posicao) {
                if (p != peao) {
                    peao.voltarInicio();
                    return;
                }
                cont++;
            }
        }
        if (cont > 1) {
            peao.voltarInicio();
        }
    }
    
    public int jogar() {
        int dado = random.nextInt(6) + 1;
        Peao peao = peoes[random.nextInt(8)];
        peao.mover(dado);
        checarColisao(peao);
        return dado;
    }

}
