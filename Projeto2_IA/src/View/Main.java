/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Evolucao;
import Model.Geracao;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Evolucao evolucao = new Evolucao();
        Geracao geracao = evolucao.criaPopulacaoInicial();
        evolucao.atualizaFitnessPopulacao(geracao);
        
        for(int i=0; i<100;i++){
            Geracao novaGeracao = evolucao.criaOutrasGeracoes(geracao);
            //evolucao.atualizaFitnessPopulacao(novaGeracao);
            System.out.println("Geração : " + novaGeracao.getIdGeracao() + 
                    "Melhor Fitness : " + novaGeracao.calculaFitnessMelhorIndividuo()+
                    "Fitness Médio : " + novaGeracao.calculaMediaFitness());
            
            geracao = novaGeracao; ///olhar aqui pq pode dar errrrrrroooooooo
        }
    }
}
