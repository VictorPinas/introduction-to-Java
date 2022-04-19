public class StringSwitchDemo{
   public static int getMonthNumber(String month){
    
      int monthNumber = 0;
      
      if (month == null){
         return monthNumber;
      }
      
      switch (month.toLowerCase()){
         case "janeiro":
            monthNumber = 1;
            break;
         case "fevereiro":
            monthNumber = 2;
            break;
         case "março":
            monthNumber = 3;
            break;
         case "abril":
            monthNumber = 4;
            break;
         case "maio":
            monthNumber = 5;
            break;
         case "junho":
            monthNumber = 6;
            break;
         case "julho":
            monthNumber = 7;
            break;
         case "agosto":
            monthNumber = 8;
            break;
         case "setembro":
            monthNumber = 9;
            break;
         case "outubro":
            monthNumber = 10;
            break;
         case "novembro":
            monthNumber = 11;
            break;
         case "dezembro":
            monthNumber = 12;
            break;
         default:
            monthNumber = 0;
            break;
      }
      return monthNumber;
   }
   public static void main(String[] args){
      String month = "Agosto";
      
      int returnedMonthNumber = 
         StringSwitchDemo.getMonthNumber(month);
        
      if (returnedMonthNumber == 0){
         System.out.println("Mês inválido");
      }else{
         System.out.println(returnedMonthNumber);
      }
   }
}