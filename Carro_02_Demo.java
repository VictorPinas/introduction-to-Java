class Carro_02_Demo{
  //O método main só aceita argumentos String[]
  public static void main(String[] args){
    //É preciso passar argumentos para Carro_02 para exibir a mensagem
    //Construtor
    Carro_02 carro_02 = new Carro_02(30, 4, 0);
    
    carro_02.setVelocidade(30);
    carro_02.setMarcha(4);
    carro_02.setFreio(0);
    carro_02.exibirEstado();
   
  }
}