/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Geracao {
    //coordenadaFim [17][18]
   /* private char[][] labirinto =   {{'#','#','#','#','#','#','#','#','#','#'},
                                    {'#','O',' ',' ','#','#','#',' ','#','#'},
                                    {'#','#',' ','#','#','#','#',' ',' ','#'},
                                    {'#',' ',' ','#','#','#','#',' ',' ','#'},
                                    {'#',' ',' ',' ',' ',' ',' ',' ','#','#'},
                                    {'#','#','#','#','#',' ','#',' ','#','#'},
                                    {'#','#','#','#',' ',' ','#',' ','#','#'},
                                    {'#','#','#','#',' ','#','#',' ',' ','#'},
                                    {'#','#','#','#',' ','#','#','#','D','#'},
                                    {'#','#','#','#','#','#','#','#','#','#'}};*/
                                   
    private int fitnessMelhorIndividuo;
    private float fitnessMedio;
    private int idGeracao;
    private ArrayList<Robo> arrayIndividuos;
    private ArrayList<Integer> arrayFitnessIndividuos;

    
    public Geracao(int idGeracao){
        this.idGeracao = idGeracao;
        arrayIndividuos = new ArrayList<Robo>(); //adiciona todos os individuos
        arrayFitnessIndividuos = new ArrayList<Integer>();//adiciona o fitness de todos os individuo
    }
    
    public void adicionaRoboGeracao(Robo robo){
        arrayIndividuos.add(robo);
        arrayFitnessIndividuos.add(robo.getFitness());
    }
    
    public int getTamanhoPopulacao(){
        return arrayIndividuos.size();
    }
    
   /* public void criaPopulacao(int qtdIndividuos){
        for (int i=0;i<qtdIndividuos;i++){
            Robo robo = new Robo();
            //Cromossomo cromossomo = new Cromossomo();
            //leitura dos sensores a partir da posicao do robo
            //chama o metodo de retornar saida a partir dos sensores 
            //e o retorno chama o metodo de adicionar passos executados
            percorreLabirinto(robo);
            
        }
        
    }*/
    
   /* private void percorreLabirinto(Robo individuo){ //retorna fitness final
        /*Verificar posição atual do robô, ver leitura sensorial a partir da posição e procurar no vetor de ações o q deve ser feito e atualiza a posição do robô*/
        /*Vai adicionando a sequencia de acoes */
        
        
        
       // individuo.adicionaPassoExecutado(cromossomo.adicionapassoexecutado);
        
        
    
    
   /* public void leituraSensorial(int xAtual, int yAtual, int xFinal, int yFinal){
        
    }*/
    
    public void calculaFitnessMelhorIndividuo(){
        Collections.sort(arrayFitnessIndividuos, Collections.reverseOrder()); //ordena em ordem decrescente
        fitnessMelhorIndividuo = arrayFitnessIndividuos.get(0);
    }
    
    public void calculaMediaFitness(){
        int acc = 0;
        Iterator it = arrayFitnessIndividuos.iterator();
        while(it.hasNext()){
            Integer fit = (Integer)it.next();
            acc += fit;
        }
        float media = acc/arrayFitnessIndividuos.size();
        fitnessMedio = media;
    }
    
    public int getFitnessMelhorIndividuo(){
        return fitnessMelhorIndividuo;
    }
    
    public float getFitnessMedio(){
        return fitnessMedio;
    }
    
    public ArrayList<Robo> getArrayIndividuos(){
        return arrayIndividuos;
    }
    
   
    public ArrayList<Integer> getArrayFitnessIndividuos(){
        return arrayFitnessIndividuos;
    }
    
    
    
   
}
