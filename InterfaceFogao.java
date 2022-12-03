//Fogao com a interface implementada
public class InterfaceFogao implements FogaoInterface{
 
 boolean ligar = False;
 int temperature = 0;
 
 void ligarFogao(boolean ligar){
   ligar = True;
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