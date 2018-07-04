package Model;

public class Avaliacao {
    private int xAtual, yAtual;
    private final int xFim = 9 , yFim=9;
    private char direcaoAtual;
    private char[][] labirinto =   {{'#','#','#','#','#','#','#','#','#','#'},
                                    {'#','O',' ',' ','#','#','#',' ','#','#'},
                                    {'#','#',' ','#','#','#','#',' ',' ','#'},
                                    {'#',' ',' ','#','#','#','#',' ',' ','#'},
                                    {'#',' ',' ',' ',' ',' ',' ',' ','#','#'},
                                    {'#','#','#','#','#',' ','#',' ','#','#'},
                                    {'#','#','#','#',' ',' ','#',' ','#','#'},
                                    {'#','#','#','#',' ','#','#',' ',' ','#'},
                                    {'#','#','#','#',' ','#','#','#','D','#'},
                                    {'#','#','#','#','#','#','#','#','#','#'}};
     
     
    public Avaliacao(){
       this.xAtual = 1;
       this.yAtual = 1;
       this.direcaoAtual = 'D'; /*possiveis direcoes D, E, Cima, Baixo    essa direcao é pra onde ele aponta a frente*/
    }
     
   //se o retorno for 3 é pq ta errado
    private int sensorParedeFrente(){
        switch (direcaoAtual) {
            case 'D':
                if(labirinto[yAtual][xAtual+1] == ' '){
                    return 0;
                }
                else if (labirinto[yAtual][xAtual+1] == '#'){
                    return 1;
                }   break;
            case 'E':
                if(labirinto[yAtual][xAtual-1] == ' '){
                    return 0;
                }
                else if(labirinto[yAtual][xAtual-1] == '#'){
                    return 1;
                }   break;
            case 'C':
                if(labirinto[yAtual-1][xAtual] == ' '){
                    return 0;
                }
                else if(labirinto[yAtual-1][xAtual] == '#'){
                    return 1;
                }   break;
            case 'B':
                if(labirinto[yAtual+1][xAtual] == ' '){
                    return 0;
                }
                else if(labirinto[yAtual+1][xAtual] == '#'){
                    return 1;
                }   break;
            default:
                break;
        }
        
        return 3;
    }             
    /*Reveeeeeeeeerrrrrrrrrrrrrrr*/
    private void calculoParaSensorDetectorFim(){ //calcula distancia
        char direcaoH, direcaoV; //direcao horizontal e vertical
        
        if(xFim == xAtual && yFim>yAtual){
            direcaoH = ' ';
            direcaoV = 'B' ;
        }
        else if(xFim == xAtual && yFim<yAtual){
            direcaoH = ' ';
            direcaoV = 'C' ;       
        }
        else if(xFim > xAtual && yFim == yAtual){
            direcaoH = 'D';
            direcaoV = ' ' ;       
        }
        else if(xFim < xAtual && yFim == yAtual){
            direcaoH = 'E';
            direcaoV = ' ' ;       
        }
        
        if(xFim > xAtual && yFim>yAtual){
            direcaoH = 'D';
            direcaoV = 'B' ;       
        }
        else if(xFim < xAtual && yFim<yAtual){
            direcaoH = 'E';
            direcaoV = 'C' ;       
        }
        else if(xFim > xAtual && yFim<yAtual){
            direcaoH = 'D';
            direcaoV = 'C' ;       
        }
        else if(xFim < xAtual && yFim>yAtual){
            direcaoH = 'E';
            direcaoV = 'B' ;       
        }
         
    }
    private int sensorFinalFrente(){
        
       switch(direcaoAtual){
            case 'D':
              if(xAtual < xFim){
                  return 1;
              } 
            break;
            case 'E':
               if(xAtual > xFim){
                   return 1;
               }
            break;
            case 'C':
               if(yAtual > yFim){
                   return 1;
               }
            break;
            case 'B':
               if(yAtual < yFim);
            break;
 
           
       }
       
       return 0;
    }
    
    //precisa verificar qual é a nova direita, caso ele gire
    //pegando a referencia de Cima, Baixo, Esquerda, Direita
    //cima -> xAtual menor
    //baixo -> xAtual maior
    //esquerda -> yAtual menor
    //direita -> yAtual maior
    
    private int sensorFinalDireita(){
       
        switch(direcaoAtual){
           case 'D':
               if(yAtual > yFim){
                   return 1;
               }
           break;
           case 'E':
               if(yAtual < yFim){
                   return 1;
                }
           break;
           case 'C':
                if(xAtual < xFim){
                    return 1;
                }
           break;
           case 'B':
               if(xAtual > xFim){
                   return 1;
                }
           break;
           
       }
        return 0;
    }
    
    //precisa verificar qual é a nova esquerda, caso ele gire
    //pegando a referencia de Cima, Baixo, Esquerda, Direita
    //cima -> xAtual maior
    //baixo -> xAtual menor
    //esquerda -> yAtual maior
    //direita -> yAtual menor
    
    private int sensorFinalEsquerda(){
        switch(direcaoAtual){
           case 'D':
                if(yAtual < yFim){
                    return 1;
                }
           break;
           case 'E':
                if(yAtual > yFim){
                   return 1;
                }
           break;
           case 'C':
                if(xAtual > xFim){
                    return 1;
                }
           break;
           case 'B':
                if(xAtual < xFim){
                    return 1;
                }
           break;
           
       }
        return 0;
    }
    
    private int sensorFinalAtras(){
        switch(direcaoAtual){
           case 'D':
               if(xAtual < xFim){
                   return 1;
               }
           break;
           case 'E':
               if(xAtual > xFim){
                   return 1;
               }
           break;
           case 'C':
                if(yAtual < yFim){
                   return 1;
               }
           break;
           case 'B':
               if(yAtual > yFim){
                   return 1;
               }
           break;
           
       }
        return 0;
    }
    
   
    
    private void atualizaPosicaoRobo(int novoX, int novoY, char novaDirecao){
        this.xAtual = novoX;
        this.yAtual = novoY;
        this.direcaoAtual = novaDirecao;
    }
    
    
     public int calculaFitness(Robo roboASerAvaliado){
        String acao = roboASerAvaliado.leituraSensorial(sensorParedeFrente(), sensorFinalFrente(),
                 sensorFinalDireita(), sensorFinalEsquerda(), sensorFinalAtras());
        
        if(this.xAtual == this.xFim && this.yAtual == this.yFim){
            roboASerAvaliado.setFitness(roboASerAvaliado.getFitness() + 500);
        } else{
        
            switch(acao){ //se acao for VR, Ve,... ele vai mover o robo e tals
                case "VT":
                    if(this.direcaoAtual == 'C'){
                        this.direcaoAtual = 'B';
                    }
                    else if(this.direcaoAtual == 'B'){
                        this.direcaoAtual = 'C';
                    }
                    else if(this.direcaoAtual == 'E'){
                        this.direcaoAtual = 'D';
                    }
                    else if(this.direcaoAtual == 'D'){
                        this.direcaoAtual = 'E';
                    }
                    roboASerAvaliado.setFitness(roboASerAvaliado.getFitness() - 5);
                break;
                case "VE":
                    if(this.direcaoAtual == 'C'){
                        this.direcaoAtual = 'E';
                    }
                    else if(this.direcaoAtual == 'B'){
                        this.direcaoAtual = 'D';
                    }
                    else if(this.direcaoAtual == 'E'){
                        this.direcaoAtual = 'B';
                    }
                    else if(this.direcaoAtual == 'D'){
                        this.direcaoAtual = 'C';
                    }
                    roboASerAvaliado.setFitness(roboASerAvaliado.getFitness() - 5);
                break;
                case "VD":
                    if(this.direcaoAtual == 'C'){
                        this.direcaoAtual = 'D';
                    }
                    else if(this.direcaoAtual == 'B'){
                        this.direcaoAtual = 'E';
                    }
                    else if(this.direcaoAtual == 'E'){
                        this.direcaoAtual = 'C';
                    }
                    else if(this.direcaoAtual == 'D'){
                        this.direcaoAtual = 'B';
                    }
                    roboASerAvaliado.setFitness(roboASerAvaliado.getFitness() - 5);
                break;
                case "SF":
                    if(this.direcaoAtual == 'C'){
                        this.yAtual--;
                    }
                    else if(this.direcaoAtual == 'B'){
                        this.yAtual++;
                    }
                    else if(this.direcaoAtual == 'E'){
                        this.xAtual--;
                    }
                    else if(this.direcaoAtual == 'D'){
                        this.xAtual++;
                    }
                    roboASerAvaliado.setFitness(roboASerAvaliado.getFitness() - 10);
                break;
            }
        }
        
        // insereFitnessNoIndividuo(); (No proprio robo
         return roboASerAvaliado.getFitness();//fitness
     }
     
     
   
}
