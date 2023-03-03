public class carroThis {
   // campos
   int velocidade = 0;
   int aceleracao = 0;
   int diminuir;
   int frear;

   // operador this em um construtor
   public carroThis(int velocidade, int aceleracao, int diminuir, int frear) {
      // métodos
      this.velocidade = velocidade;
      this.aceleracao = aceleracao;
      this.diminuir = diminuir;
      this.frear = frear;
   }

   public static void main(String[] args) {
      int velocidade = 100;
      int aceleracao = 10;
      int diminuir = 5;
      int frear = 0;

      carroThis carroThis = new carroThis(velocidade, aceleracao, diminuir, frear);

      System.out.println(carroThis.velocidade);
      System.out.println(carroThis.aceleracao);
      System.out.println(carroThis.diminuir);
      System.out.println(carroThis.frear);
   }
}