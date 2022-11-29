import java.io.FileNotFoundException;

public class MondayClass {
    public static void main(String [] args) throws FileNotFoundException {
       ReadWrite file1 = new ReadWrite();

       file1.write();
       file1.writeFile();
       file1.readFile();
    }
    
}
