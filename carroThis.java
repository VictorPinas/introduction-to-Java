public class carroThis{
   int velocidade = 40;
   int aceleracao = 60;
   int diminuir = 10;
   int frear = 0;
   
  //operador this em um construtor
   public carroThis(int velocidade, int aceleracao, int diminuir, int frear){
      this.velocidade = velocidade;
      this.aceleracao = aceleracao;
      this.diminuir = diminuir;
      this.frear = frear;
   }
  
   void exibirMovimento(){
      System.out.println(velocidade + ", " + aceleracao + ", " + diminuir + ", " + frear);
   }
   
}