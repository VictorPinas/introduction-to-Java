//Fogao com a interface implementada
public class InterfaceFogao implements FogaoInterface{
 
 boolean ligar = false;
 int temperature = 0;
 
 //os métodos precisam da palavra chave public
 //senão acusa o seguinte erro: attempting to assign weaker access privileges; was public
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
