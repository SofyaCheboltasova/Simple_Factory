import java.io.*;
import java.util.TreeSet;

public class Statistics {
    final TreeSet<CharacterForSet> statistics = new TreeSet<>();

    public void addCharacter(String c) {
        final CharacterForSet character = new CharacterForSet(c);
        statistics.add(character);
    }

    public void getStatistics() {
        try {
            final BufferedWriter output =
                    new BufferedWriter(new FileWriter("C://Users//sofya//IdeaProjects//lab1//src//statistics.txt"));

            for (CharacterForSet c : statistics)
                output.write(c.character + " = " + c.count + "\n");

            output.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
