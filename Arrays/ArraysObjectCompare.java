import java.util.Arrays;

class ArraysObjectCompare{
 public static void main(String[] args){
   String[] string1 = {"a", "b", "c"};
   String[] string2 = {"a", "b", "c"};
   
   System.out.println(string1 == string2); //false
   System.out.println(Arrays.equals(string1, string2)); //true
 }
}