//Fogao com a interface implementada
public class InterfaceFogao implements FogaoInterface{
 
 boolean ligar = false;
 int temperature = 0;
 
 void ligarFogao(boolean ligar){
   ligar = true;
 }
 
 void aumentarTemp(int aumentar){
   temperature = temperature + aumentar;
 }
 
 void diminuirTemp(int diminuir){
   temperature = temperature - diminuir;
 }
 
 void printStates(){
   System.out.println("Fogão ligado? " + ligar
   + "Temperatura? " + temperature);
 }

}