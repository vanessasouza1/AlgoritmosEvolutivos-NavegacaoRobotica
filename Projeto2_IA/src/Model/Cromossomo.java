/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */
public class Cromossomo {

    private int[][] entradas = {{0,0,0,0,1},
                                {0,0,0,1,0},
                                {0,0,0,1,1},
                                {0,0,1,0,0},
                                {0,0,1,0,1},
                                {0,1,0,0,0},
                                {0,1,0,1,0},
                                {0,1,1,0,0},
                                {1,0,0,0,0},
                                {1,0,0,0,1},
                                {1,0,0,1,0},
                                {1,0,0,1,1},
                                {1,0,1,0,0},
                                {1,0,1,0,1},
                                {1,1,0,0,0},
                                {1,1,0,1,0},
                                {1,1,1,0,0}};
    
    private String[] acao = {"VT", "VE", "VE", "VD", "VD", "SF", "SF", "SF", "VE", "VT", "VE", "VE", "VD", "VD", "VE", "VE", "VD"};
    //private int fitness;
    //private ArrayList<String> passosExecutados;
    
    Cromossomo(){
       // passosExecutados = new ArrayList<String>();
        //fitness = 200;
    }
    
    public String retornaAcaoAPartirDosSensores(int paredeFrente, int finalFrente,
            int finalDireita, int finalEsquerda, int finalAtras){
        int posicaoAcao = 0;
        for(int i=0; i<entradas.length;i++){
            if(entradas[i][0] == paredeFrente && entradas[i][1] == finalFrente &&
              entradas[i][2] == finalDireita && entradas[i][3] == finalEsquerda
              && entradas[i][4] == finalAtras){
                posicaoAcao=i;
                break;
            }
        }
        return acao[posicaoAcao]; 
    }
    
  /*  public void adicionaPassoExecutado(String passoExecutado){
        passosExecutados.add(passoExecutado);
    }
    
    public String retornaPassoExecutado(){
        return
    }*/
    
   /* public void perdeFitnessAcao(){
        this.fitness = this.fitness - 1;          
    }
    
    public void ganhaFitnessFinal(){
        this.fitness = this.fitness + 200;
    }*/
    
    
   
    
    
   
    
    
    /*Criação do individuo*/
 /*   public void criaIndividuo(){

    }
    
    
    
    public void execucaoIndividuo(){

    }
    
    
    /*Fitness
    public void setFitness(Double fitness){

    }
    
    public Double getFitness(){
        return null;

    }*/
    
}
