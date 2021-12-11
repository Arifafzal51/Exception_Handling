import java.io.FileInputStream;

public class NewTest
{
    public static void main(String[] args) {
        int a;
        try {
            a = 100;
            int b = 0;
            int c;
            c = a*b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(c, e);
        }
    }
}

