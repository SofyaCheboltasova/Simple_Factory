import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Alphabet {
    static final Map<Character, String> codeAlphabet = new TreeMap<>();
    static final Map<String, Character> decodeAlphabet = new TreeMap<>();

    public static void fillAlphabet(String command) {
        try {
            final List<String> stringAlph = Files.readAllLines
                    (Paths.get("C://Users//sofya//IdeaProjects//lab1//src//alphabet"), StandardCharsets.UTF_8);

            for (String line : stringAlph) { // Reading lines in alphabet
                final char letter = line.charAt(0);
                String morseLetter = line.substring(2);

                if (letter == ' ')
                    morseLetter = " ";

                if (command.equals("code"))
                    codeAlphabet.put(letter, morseLetter);
                else
                    decodeAlphabet.put(morseLetter, letter);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    static String getCode(Character c) throws IOException {
        if (codeAlphabet.get(Character.toLowerCase(c)) == null)
            throw new IOException("There is an undefined character");

        return codeAlphabet.get(Character.toLowerCase(c));
    }
    static Character getDecode(String c) throws IOException {
        if (decodeAlphabet.get(c) == null)
            throw new IOException("There is an undefined string");

        return decodeAlphabet.get(c);
    }
}