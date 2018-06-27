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
    private int fitness;
    
    Cromossomo(){
        fitness = 200;
    }
    
    public void perdeFitnessAcao(){
        this.fitness = this.fitness - 1;          
    }
    
    public void ganhaFitnessFinal(){
        this.fitness = this.fitness + 200;
    }
   
    
    /*Definicao dos parametros da representacao do individuo*/
    public void defineSimbolosIniciais(){

        
    }
    
    
    /*Criação do individuo*/
    public void criaIndividuo(){

    }
    
    
    
    public void execucaoIndividuo(){

    }
    
    
    /*Fitness*/
    public void setFitness(Double fitness){

    }
    
    public Double getFitness(){
        return null;

    }
    
}
