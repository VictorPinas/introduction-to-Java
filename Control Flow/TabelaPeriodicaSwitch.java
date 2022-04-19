public class TabelaPeriodicaSwitch{
  public static int getPeriodicNumber(String number){
    
    int periodicNumber = 0;
    
    if(number == null){
      return periodicNumber;
    }
    
    switch (number.toLowerCase()){
      case "hidrogênio":
        periodicNumber = 1;
        break;
      case "litío":
        periodicNumber = 2;
        break;
      case "sódio":
        periodicNumber = 3;
        break;
      case "potássio":
        periodicNumber = 4;
        break;
      case "rubídio":
        periodicNumber = 5;
        break;
      case "césio":
        periodicNumber = 6;
        break;
      case "frâncio":
        periodicNumber = 7;
        break;
      default:
        periodicNumber = 0;
        break;
    }
    return periodicNumber;
  }
  public static void main(String[] args){
    String number = "césio";
    
    int returnedPeriodicNumber = 
      TabelaPeriodicaSwitch.getPeriodicNumber(number);
      
    if (returnedPeriodicNumber == 0){
      System.out.println("Esse elemento não existe");
    }else{
      System.out.println("O elemento césio tem número atômico: "
      + returnedPeriodicNumber);
    }
  }
}