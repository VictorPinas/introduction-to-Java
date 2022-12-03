public class carroThisDemo{
  public static void main(String[] args){
    CarroThis carroThis = new CarroThis(velocidade, aceleracao, diminuir, frear);
    
    System.out.println(carroThis.velocidade);
    System.out.println(carroThis.aceleracao);
    System.out.println(carroThis.diminuir);
    System.out.println(carroThis.frear);
  }
}