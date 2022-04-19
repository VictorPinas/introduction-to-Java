class ArrayFilling {
    public static void main(char[] args){
        String[] arrayToFill = {"Sprite", "Fanta", "Coca cola"};
        char[] filledArray;
        filledArray = new char[20];
        
        char[] filledArray = java.util.Arrays.fill(arrayToFill, "coffee");
        System.out.print(arrayToFill);
    }
}