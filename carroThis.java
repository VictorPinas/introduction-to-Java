public class carroThis{
  public int velocidade, aceleracao, diminuir, frear;
  
  //operador this em um construtor
  public carroThis(){
   this.velocidade = velocidade;
   this.aceleracao = aceleracao;
   this.diminuir = diminuir;
   this.frear = frear;
  }
  
  public int movimento(int velocidade, int aceleracao, int diminuir, int frear){
    this(0, 0, 0, 0, velocidade, aceleracao, diminuir, frear);
  }
  
  public int iniciarMovimento(int velocidade, int aceleracao, int diminuir, int frear){
    this.velocidade = velocidade;
    this. aceleracao = aceleracao;
    this.diminuir = diminuir;
    this.frear = frear;
  }
  
}