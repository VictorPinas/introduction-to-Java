class Fogao{
   boolean on = false;
   int fogo = 0;
   
   void ligado(boolean ligar){
       on = ligar;
   }
   
   void aumentarFogo(int fogoMais){
      fogo = fogo + fogoMais;
   }
   
   void diminuirFogo(int fogoMenos){
       fogo = fogo + fogoMenos;
   }
   
   void printStates(){
       System.out.println("Ligado: " + on +
       " temperatura da chama: " + fogo + "ºC");
   }
}