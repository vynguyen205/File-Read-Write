import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {

    private String fileName;
    private String fileType;
    private int timesPrint;
    private String message;

    public ReadWrite() {}

    public void greeting() {
        System.out.println("\n⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️\n");
        System.out.println("  🗂 WELCOME TO YOUR FILE MANAGER 🗂\n");
        System.out.println("Let's get started with some questions!");
        System.out.println("\n⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️\n");
    }

    public void write() {
        Scanner in = new Scanner (System.in);

        greeting();

        System.out.print("Name of file: ");
        fileName = in.nextLine();
        
        System.out.print("\nFile type (txt or java): ");
        fileType = in.nextLine();

        System.out.print("\nWrite your message here: ");
        message = in.nextLine();

        System.out.print("\nHow many times do you want to print?  ");
        timesPrint = in.nextInt();
    }
    
    public void writeFile() {
        try {
            PrintWriter out = new PrintWriter(fileName + "." + fileType);
    
            for (int i = 0; i < timesPrint; i++) {
                out.println(message);
            }
            out.close();

        } catch (Exception e) {
            System.out.println ("🚨 Write file error 🚨");
        }
    }

    public void readFile() {
        try {
            FileReader inputFile = new FileReader(fileName + "." + fileType);
            Scanner in = new Scanner(inputFile);
            
            System.out.println("\n⭐️ Here's what you wrote ⭐️\n");
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
            System.out.println("\nAll done. Good Bye!");

        } catch (Exception e) {
            System.out.println ("🚨 Read file error 🚨");
        }
    }
}
