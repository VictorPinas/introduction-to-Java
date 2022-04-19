class CarroDemo{
  public static void main(String[] args){
    Carro carro = new Carro();
    
    carro.ligarCarro(true);
    carro.acelerarCarro(50);
    carro.diminuirVeloz(10);
    carro.frearCarro(0);
    carro.darSinal(true);
    carro.ligarFarois(true);
    carro.exibirEstado();
  }
}