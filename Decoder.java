import java.io.*;

public class Decoder {
    public static void start(BufferedReader fileName) {
        try {
            Alphabet.fillAlphabet("decode");

            final BufferedWriter output =
                    new BufferedWriter(new FileWriter("C://Users//sofya//IdeaProjects//lab1//src//output.txt"));
            final Statistics stat = new Statistics();

            String line = fileName.readLine();

            while(line != null) { // Decoding text
                final String[] c = line.split(" ");

                for(int i = 0; i < c.length; ++i) {
                    if(!c[i].equals("")) {
                        output.write(Character.toUpperCase(Alphabet.getDecode(c[i])));
                        stat.addCharacter(c[i]);
                    }

                    else if (i < c.length - 1 && c[i + 1].equals("")){
                        output.write(' ');
                        ++i;
                    }
                }
                output.write('\n');
                line = fileName.readLine();
            }
            stat.getStatistics();
            output.close();
        }

        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
