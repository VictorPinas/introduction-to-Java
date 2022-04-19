//Será que faltou um construtor no meu código?
//Os construtores estão juntos aos métodos
//É possível mescla los? Sim
//Porém, não é recomendável.
public class Carro{
  private boolean ligado = false;
  private int velocidade = 0;
  private int aceleracao = velocidade;
  private int diminuir = aceleracao;
  private int frearCarro = diminuir;
  private boolean farol = false;
  private boolean sinal = false;
  
  void ligarCarro(boolean ligar){
    ligado = ligar;
  }
  
  //Qual a velocidade do carro? -10 km/h
  //O carro acelerou até qual velocidade? 0 km/h
  void acelerarCarro(int aceleracao){
    while(velocidade == 50){
      aceleracao += velocidade; //construtor
    }
  }
  
  //O carro diminui até qual velocidade? 0 km/h
  void diminuirVeloz(int diminuir){
    do{
      velocidade = velocidade - 10; //construtor
    }while(velocidade > 10);
  }
  
  //O carro freou? 0
  void frearCarro(int frearCarro){
    if(velocidade == 10){
    //então velocidade recebe 0
      velocidade = 0;
    }else{
    //senão velocidade recebe -diminuir
    //velocidade = velocidade - 1;
      velocidade -= diminuir;
    }
  }
     
  void ligarFarois(boolean ligarFarois){
    farol = ligarFarois;
  }
  
  void darSinal(boolean darSinal){
    sinal = darSinal;
  }
  
  void exibirEstado(){
    System.out.print("O carro esta ligado? "
    + ligado + " Qual a velocidade do carro? " 
    + velocidade + " km/h" + " O carro acelerou até qual velocidade? "
    + aceleracao + " km/h" + " O carro diminui até qual velocidade? "
    + diminuir + " km/h" + " O carro freou? " + frearCarro
    + " O carro esta com os faróis acesos? " + farol
    + " O sinal da seta esta ligado? " + sinal);    
  }
}