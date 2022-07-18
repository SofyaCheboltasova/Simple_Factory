import java.io.*;

public class Coder {
    public static void start(BufferedReader fileName) {
        try {
            Alphabet.fillAlphabet("code");
            final BufferedWriter output =
                    new BufferedWriter(new FileWriter("C://Users//sofya//IdeaProjects//lab1//src//output.txt"));
            final Statistics stat = new Statistics();

            String line = fileName.readLine();

            while (line != null) { //Coding text
                final char[] buffer = line.toCharArray();

                for (char c : buffer) {
                    output.write(Alphabet.getCode(Character.toLowerCase(c)));
                    output.write(' ');
                    stat.addCharacter(String.valueOf(Character.toLowerCase(c)));
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

// Поменять ввод coder decoder +
// Вынести мапы из классов +
// decoder +
// Статистика
//https://www.callicoder.com/java-read-file/ - readAllLines
