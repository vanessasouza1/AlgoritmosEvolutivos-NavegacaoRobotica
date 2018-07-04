/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Robo {
    //private int x, y;
    //private char direcao;
    
    //private int[] leituraSensorial; //sensorParedeFrente, sensorFinalFrente, sensorFinalDireita, sensorFinalEsquerda, sesorFinalAtras
    private Cromossomo cromossomo;
    private int fitness, geracao, idRobo;
    private static int id = 0;
    private ArrayList<String> sequenciaPassos;
    
    //private ArrayList<String> passosExecutados;
    
    public Robo(){
        /*this.x = 1;
        this.y = 1;
        this.direcao = 'F';*/
        
        //leituraSensorial = new int[5];
        fitness = 0;
        cromossomo = new Cromossomo();
        sequenciaPassos = new ArrayList<String>();
        id += 1;
        idRobo = id;
        
        
    }
    
    /*Ler os sensores na sua posição atual e adiciona a ação esperada ao array sequencia passos*/
    /*quando for adicionar os passos do robo ao atualizar o fitness usa esse metodo*/
    public String leituraSensorial(int paredeFrente, int finalFrente,
            int finalDireita, int finalEsquerda, int finalAtras){
            String acao = cromossomo.retornaAcaoAPartirDosSensores(paredeFrente, finalFrente, finalDireita, finalEsquerda, finalAtras);
            sequenciaPassos.add(acao);
            return acao;
    }
    
    
    
    public void setPosicaoSequenciaPassos(int posicao, String elemento){
        sequenciaPassos.add(posicao, elemento);
    }
    
    public int getTamanhoCromossomo(){
        return sequenciaPassos.size();
    }
    
    
    public int getIdRobo(){
        return idRobo;
    }

    public ArrayList<String> getSequenciaPassos(){
        return sequenciaPassos;
    }
    
    public Cromossomo getCromossomo(){
        return cromossomo;
    }
  /*  public int getX() {
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

    public char getDirecaoAtual() {
        return direcao;
    }

    public void setDirecaoAtual(char direcao) {
        this.direcao = direcao;
    }*/
    
    public int getgeracao() {
        return geracao;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }
    
    public int getFitness() {
        return fitness;
    }

    public void setFitness(char fitness) {
        this.fitness = fitness;
    }
    
    /*
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
    }*/
    
    
  /*  public void setSensorParedeFrente(int leitura){
        leituraSensorial[0] = leitura;
    }
    
    public void setSensorFinalFrente(int leitura){
        leituraSensorial[1] = leitura;
    }
    
    public void setSensorFinalDireita(int leitura){
        leituraSensorial[2] = leitura;
    }
    
    public void setSensorFinalEsquerda(int leitura){
        leituraSensorial[3] = leitura;
    }
    
    public void setSensorFinalAtras(int leitura){
        leituraSensorial[4] = leitura;
    }
    
    public int[] getLeituraSensorial(){
        return leituraSensorial;
    }
    
    
    
    */
}
