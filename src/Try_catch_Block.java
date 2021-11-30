public class Try_catch_Block {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of code");
    }
}
