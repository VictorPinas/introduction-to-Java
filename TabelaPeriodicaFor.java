class TabelaPeriodicaFor {
    public static void main(String[] args){
         String[][] elements = {
             //Arrays com 7 elementos
             //0 - 6
            /*[i]*/  {"Hidrogênio", "Litío", "Sódio", "Potássio", "Rubídio", "Césio", "Frâncio"},
            /*[j]*/  {"1", "2", "3", "4", "5", "6", "7"}
         };
         for(int i = 0; i < elements.length; i++){
           for(int j = 0; j < elements[i].length; j++){
           //elements contém dois arrays
             System.out.println("Elementos: " + elements[i][j]);
             
           }
         }
                  
    }
}