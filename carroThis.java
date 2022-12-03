public class carroThis{
   int velocidade;
   int aceleracao;
   int diminuir;
   int frear;
   
  //operador this em um construtor
   public carroThis(int velocidade, int aceleracao, int diminuir, int frear){
      this.velocidade = velocidade;
      this.aceleracao = aceleracao;
      this.diminuir = diminuir;
      this.frear = frear;
   }
   public static void main(String[] args){
    CarroThis carroThis = new carroThis(velocidade, aceleracao, diminuir, frear);
    
    System.out.println(carroThis.velocidade);
    System.out.println(carroThis.aceleracao);
    System.out.println(carroThis.diminuir);
    System.out.println(carroThis.frear);
   }
}