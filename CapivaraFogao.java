//Fogao com a interface implementada
public class CapivaraFogao implements FogaoCapi{
 
 boolean ligar = false;
 int temperature = 0;
 
 //os métodos precisam da palavra chave public
 //senão acusa o seguinte erro: attempting to assign weaker access privileges; was public
 //regra: a classe que implementa deve ter os métodos public
 //senão o método fica invisível para a interfac
 public void ligarFogao(boolean ligar){
   ligar = true;
 }
 
 public void aumentarTemp(int aumentar){
   temperature = temperature + aumentar;
 }
 
 public void diminuirTemp(int diminuir){
   temperature = temperature - diminuir;
 }
 
 public void printStates(){
   System.out.println("Fogão ligado? " + ligar
   + "Temperatura? " + temperature);
 }

}
