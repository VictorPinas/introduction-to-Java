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
      // faltou instanciar os campos aqui
      int velocidade = 100;
      int aceleracao = 10;
      int diminuir = 5;
      int frear = 0;
      
      // Senão, ele avisa que variaveis não estáticas não podem ser referenciadas
      // em um contexto estático
      // porque o compilador não encontrou dentro do método main
      carroThis carroThis = new carroThis(velocidade, aceleracao, diminuir, frear);

      System.out.println(carroThis.velocidade);
      System.out.println(carroThis.aceleracao);
      System.out.println(carroThis.diminuir);
      System.out.println(carroThis.frear);
   }
}