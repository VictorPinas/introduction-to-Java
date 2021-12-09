class TabelaPeriodica {
    public static void main(String[] args){
         String[][] elements = {
             {"Hidrogênio", "Litío", "Sódio", "Potássio", "Rubídio", "Césio", "Frâncio"},
             {"1", "2", "3", "4", "5", "6", "7"}
         };
         //elementos por período
         System.out.println("Elemento: " + elements[0][0] + " período: " + elements[1][0]);
         System.out.println("Elemento: " + elements[0][1] + " período: " + elements[1][1]);
         System.out.println("Elemento: " + elements[0][2] + " período: " + elements[1][2]);
         System.out.println("Elemento: " + elements[0][3] + " período: " + elements[1][3]);
         System.out.println("Elemento: " + elements[0][4] + " período: " + elements[1][4]);
         System.out.println("Elemento: " + elements[0][5] + " período: " + elements[1][5]);
         System.out.println("Elemento: " + elements[0][6] + " período: " + elements[1][6]);
    }
}