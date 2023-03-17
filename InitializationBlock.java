public class InitializationBlock{
    {
        System.out.println("Instance block 1");
    }

    static {
        System.out.println("Static block 1");
    }
    {
        System.out.println("Instance block 2");
    }

    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args){
        InitializationBlock a = new InitializationBlock();

        InitializationBlock b = new InitializationBlock();
    }
}