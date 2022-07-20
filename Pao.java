public class Pao {
   boolean pedir = false;
   int quantia = 0;
   int tempo;
  
   void fazerPedido(boolean pedirPao){
      pedir = pedirPao;
   }
  
   void pedirQtia(int quantiaPao){
      quantia = quantiaPao;
   }
  
   void prepTemp(int tempoPao){
      tempo = tempoPao;
   }
  
   void printQtiaetempo(){
      System.out.println("Fazer pedido? " + pedir +
         " quantidade: " + quantia + " tempo de preparo: " + tempo);
   }

}