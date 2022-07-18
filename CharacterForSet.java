public class CharacterForSet implements Comparable<CharacterForSet>{
    final String character;
    int count;

    public CharacterForSet(String c) {
        this.character = c;
        this.count = 1;
    }

    @Override
    public int compareTo(CharacterForSet other) {
        final int comparison = this.character.compareTo(other.character);
        if(comparison == 0)
            other.count += this.count;
        return comparison;
    }
}
