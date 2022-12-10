class PrintArrays{
 public static void main(String[] args){
   int[] numbers = {5, 0, 8, 0, 10};
   
   System.out.println(numbers);
   
   for(int i = 0; i < numbers.length; i++)
      System.out.println(numbers[i] + " ");
      //System out:
      //Address of the array: [I@d716361
      //Array: 5, 0, 8, 0, 10
 }
}