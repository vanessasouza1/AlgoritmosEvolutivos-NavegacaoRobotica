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
     
    
    
    public void obtemLeituraSensoresApartirDaPosicao(int fimX, int fimY, int roboX, int roboY, char posicao){
        
        /*A referencia vai ter q ser absoluta para n perder para que lado esta indo no labirinto*/
        
        //chama robo.leituraSensorial(); e depois chama movimentarobo
        
        
       // if()
       
       //tem que procurar a direcao do fim
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
        else if(xFim > xAtual && yFim ==yAtual){
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
    private void sensorFinalFrente(){
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
    }
    
    private void sensorFinalDireita(){
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
    }
    
    private void sensorFinalEsquerda(){
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
    }
    
    private void sensorFinalAtras(){
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
    }
    
    
    
    
    
    private void movimentaRobo(){
        
    }
    private void modificaDirecaoRobo(){
        
    }
    
    private void atualizaPosicaoRobo(int novoX, int novoY, char novaDirecao){
        this.xAtual = novoX;
        this.yAtual = novoY;
        this.direcaoAtual = novaDirecao;
    }
    
    
    
     
     
     public int calculaFitness(){
         return 0;
     }
     
     private void insereFitnessNoIndividuo(int geracaoIndividuo, int idRobo, int fitness){
         
     }
     
     
   
}
