public class PaoDemo {
  public static void main(String[] args){
    Pao pao = new Pao();
  
    pao.fazerPedido(true);
    pao.pedirQtia(5);
    pao.prepTemp(45);
    pao.printQtiaetempo();
  }

}