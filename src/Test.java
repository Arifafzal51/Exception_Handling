import java.io.FileInputStream;

public class Test
{
    public static void main(String[] args) {
        //  FileInputStream fi = new FileInputStream("d;/Arif");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception b)
        {
            System.out.println(b);

        }


    }
}

