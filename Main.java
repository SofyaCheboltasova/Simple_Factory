import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Type code / decode and file name\n");
            final String input = in.nextLine();
            final String[] command = input.split(" ");

            final BufferedReader fileName = new BufferedReader
                    (new FileReader("C://Users//sofya//IdeaProjects//lab1//src//" + command[1]));

            if (command[0].equals("code"))
                Coder.start(fileName);
            else if (command[0].equals("decode"))
                Decoder.start(fileName);
            else
                System.out.println("Wrong statement");

            in.close();
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
