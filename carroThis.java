public class carroThis{
  private int velocidade, aceleracao, diminuir, frear;
  private boolean ligar, desligar, farol, sinal;
  
  //operador this em um construtor
  public carroThis(){
   this(0, 0, 0, 0);
   this(false, false, false, false);
  }
  
  public movimento(int velocidade, int aceleracao, int diminuir, int frear){
    this(0, 0, 0, 0, velocidade, aceleracao, diminuir, frear);
  }
  
  public ignicao(boolean ligar, boolean desligar, boolean farol, boolean sinal){
    this(false, false, false, false, ligar, desligar, farol, sinal);
  }
  
  public movimento(int velocidade, int aceleracao, int diminuir, int frear){
    this.velocidade = velocidade;
    this. aceleracao = aceleracao;
    this.diminuir = diminuir;
    this.frear = frear;
  }
  public ignicao(boolean ligar, boolean desligar, boolean farol, boolean sinal){
   this.ligar = ligar;
   this.desligar = desligar;
   this.farol = farol;
   this.sinal = sinal;
  }  
  
}