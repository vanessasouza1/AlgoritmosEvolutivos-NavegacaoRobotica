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
     
    
    
    
    public Integer[] obtemLeituraSensoresApartirDaPosicao(int fimX, int fimY, int roboX, int roboY, char posicao){
        
        /*A referencia vai ter q ser absoluta para n perder para que lado esta indo no labirinto*/
        
        //chama robo.leituraSensorial(); e depois chama movimentarobo
        
        
       // if()
       
       //tem que procurar a direcao do fim
       Integer[] leitura = new Integer[5];
       
       
       return leitura;
    }
    
    private void retornaPosicaoVaziAoRedor(){
    
        
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
        
        if(yFim == yAtual && xFim > xAtual){
            return 1;
        }

            return 0;
        
//       switch(direcaoAtual){
//           case 'D':
//               
//           break;
//           case 'E':
//               
//           break;
//           case 'C':
//               
//           break;
//           case 'B':
//               
//           break;
//           
//           ;
           
       //}
    }
    //precisa verificar qual é a nova direita, caso ele gire
    //pegando referencia de Norte, Sul, Oeste, Leste
    // norte -> direita x igual, y menor
    // sul -> direita x igual, y maior
    // oeste -> direita x menor, y igual
    // leste -> direita x maior, y igual
    
    private int sensorFinalDireita(){
       
        switch(direcaoAtual){
           case 'D':
               if(xAtual > xFim && yAtual == yFim){
                   
               }
           break;
           case 'E':
               if(xAtual < xFim && yAtual == yFim){
               
                }
           break;
           case 'C':
                if(xAtual == xFim && yAtual < yFim){
                    return 1;
                }
           break;
           case 'B':
               if(xAtual == xFim && yAtual > yFim){
            
                }
           break;
           
       }
        return 3;
    }
    
    private int sensorFinalEsquerda(){
        switch(direcaoAtual){
           case 'D':
               
           break;
           case 'E':
               
           break;
           case 'C':
               
           break;
           case 'B':
               
           break;
           
       }
        return 3;
    }
    
    private int sensorFinalAtras(){
        switch(direcaoAtual){
           case 'D':
               
           break;
           case 'E':
               
           break;
           case 'C':
               
           break;
           case 'B':
               
           break;
           
       }
        return 3;
    }
    
    private void movimentaRobo(int xAtual, int yAtual, char direcao){ //a direcao padrão vai ser direita
        //o melhor na movimentacao é deixar a direcao fixa
        
    }
    
   
    
    private void atualizaPosicaoRobo(int novoX, int novoY, char novaDirecao){
        this.xAtual = novoX;
        this.yAtual = novoY;
        this.direcaoAtual = novaDirecao;
    }
    
    
     public int calculaFitness(Robo roboASerAvaliado){
        String acao = roboASerAvaliado.leituraSensorial(sensorParedeFrente(), sensorFinalFrente(),
                 sensorFinalDireita(), sensorFinalEsquerda(), sensorFinalAtras());
        
        switch(acao){ //se acao for VR, Ve,... ele vai mover o robo e tals
            case "VT":
                
            break;
            case "VE":
            
            break;
            case "VD":
            
            break;
            case "SF":
            
            break;
        }
         
        
         
        
        // insereFitnessNoIndividuo(); (No proprio robo
         return 0;//fitness
     }
     
     //nem precisa desse metodo
     private void insereFitnessNoIndividuo(int geracaoIndividuo, int idRobo, int fitness){
         
     }
     
     
   
}
