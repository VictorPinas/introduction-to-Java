class ArrayDemo{
    public static void main(String [] args){
        //declarar um arranjo de inteiros
        int[] anArray;
        
        //aloca memória para 10 inteiros
        anArray = new int[10];
        
        //inicia o primeiro elemento
        anArray[0] = 100;
        //inicia o segundo elemento
        anArray[1] = 200;
        //e assim por diante
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        
        System.out.println("Elemento do índice zero: " + anArray[0]);
        System.out.println("Elemtno do índice um: " + anArray[1]);
        System.out.println("Elemento do índice dois: " + anArray[2]);
        System.out.println("Elemento do índice três: " + anArray[3]);
        System.out.println("Elemento do índice quatro: " + anArray[4]);
        System.out.println("Elemento do índice cinco: " + anArray[5]);
        System.out.println("Elemento do índice seis: " + anArray[6]);
        System.out.println("Elemento do índice sete: " + anArray[7]);
        System.out.println("Elemento do índice oito: " + anArray[8]);
        System.out.println("Elemento do índice nove: " + anArray[9]);
    }
}