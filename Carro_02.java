public class Carro_02 {
   private int velocidade;
   private int freio;
   private int marcha;
   
   public Carro_02(int iniciarVelocidade, int iniciarFreio, int iniciarMarcha){
      velocidade = iniciarVelocidade;
      freio = iniciarFreio;
      marcha = iniciarMarcha;
   } //O construtor esta na classe Carro_02_Demo
   // Aqui trata do encapsulamento de dados
   
   public int getVelocidade(){
      return velocidade;
   }
   
   public void setVelocidade(int newValue){
      velocidade = newValue;
   }
   
   public int getMarcha(){
      return marcha;
   }
   
   public void setMarcha(int newValue){
      marcha = newValue;
   }
   
   public int getFreio(){
      return freio;
   }
   
   public void setFreio(int newValue){
      velocidade = newValue;
   }
   
   public void exibirEstado(){
      System.out.println("Velocidade atual: " +
         + velocidade + " Marcha atual: " + marcha +
         " Freio: " + freio);
   }
}