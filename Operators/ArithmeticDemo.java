class ArithmeticDemo{
  public static void main(String[] args){
    int result = 1 + 2;
    //result é 3
    System.out.println("1 + 2 = " + result);
    int original_result = result;
    
    result = result - 1;
    //result agora é 2
    System.out.println(original_result + " - 1 = " + result);
    original_result = result;
    
    result = result * 2;
    //result agora é 4
    System.out.println(original_result + " * 2 = " + result);
    original_result = result;
    
    result = result / 2;
    //result agora é 2
    System.out.println(original_result + " / 2 = " + result);
    original_result = result;
    
    result = result + 8;
    //result agora é 10
    System.out.println(original_result + " + 8 = " + result);
    original_result = result;
    
    result = result % 7;
    //result agora é 3
    System.out.println(original_result + " % 7 = " + result);
    original_result = result;
  }
}