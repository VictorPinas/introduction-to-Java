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
    System.out.println(velocidade + ", " + aceleracao + ", " + diminuir + ", " + frear);
  }
}