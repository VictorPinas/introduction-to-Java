class ChuveiroDemo{
   public static void main(String[] args){
       Chuveiro chuveiro = new Chuveiro();
       
       chuveiro.turnOn(true);
       chuveiro.changeTemp(25.5f);
       chuveiro.tempUp(30.9f);
       chuveiro.tempDown(27.8f);
       chuveiro.printStates();
   }
}