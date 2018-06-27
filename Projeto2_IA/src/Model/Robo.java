/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Robo {
    private int x, y;
    private char direcao;
    
    public Robo(){
        this.x = 1;
        this.y = 1;
        this.direcao = 'F';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
    
    public void viraDireita(){
        this.direcao = 'D';
    }
    
    public void viraEsquerda(){
        this.direcao = 'E';
    }
    
    public void viraTras(){
        this.direcao = 'T';
    }
    
    public void atualizaFrente(){
        this.direcao = 'F';
    }
}
