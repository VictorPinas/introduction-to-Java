class FogaoDemo{
   public static void main(String[] args){
       Fogao fogao = new Fogao();
       
       fogao.ligado(true);
       fogao.aumentarFogo(100);
       fogao.diminuirFogo(30);
       fogao.printStates();
   }
}