public class StringDoWhile{
  public static void main(String[] args){
    String arr[] = {"char", "mendes", "pol", "loris", "jon"};
    int i = 0;
    do{
     System.out.println(arr[i]);
      i++;
    }while(i < arr.length);
  }
}