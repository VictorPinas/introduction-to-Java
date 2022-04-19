class TabelaPeriodicaFor{
   public static void main(String[] args){
      String[][] elements = {
             {"Hidrogênio", "Litío", "Sódio", "Potássio", "Rubídio", "Césio", "Frâncio"},
             {"1", "2", "3", "4", "5", "6", "7"}
         };
      String searchfor = "Potássio";
         
      int i;
      int j = 0;
      boolean foundIt = false;
         
      search:
          for (i = 0; i < elements.length; i++){
           for (j = 0; j < elements[i].length; j++){
            if (elements[i][j] == searchfor){
               foundIt = true;
               break search;
            }
         }
      }
          
      if (foundIt) {
         System.out.println("Found " + searchfor + " at " + i + " , " + j);
      } else {
         System.out.println(searchfor + " not in the elements.");
      }
   }
}