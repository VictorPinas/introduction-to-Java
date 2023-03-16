import java.util.Arrays;

class ArrayBytes {
    public static void main(String[] args) {
        byte[] bytes1 = { 0b0010_0101 };
        byte[] bytes2 = { 0b0010_0101 };

        System.out.println(Arrays.equals(bytes1, bytes2));
    }
}