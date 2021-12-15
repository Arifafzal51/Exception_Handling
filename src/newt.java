public interface newt {
    public static void main(String[] args) {
        try {
            int d =0;
            int n =20;
            int fraction = n/d;
        }
        catch (ArithmeticException e){
            System.out.println("Due to Exception = "+e);

        }
        finally {
            System.out.println("Work Done");
        }
    }
}
