import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class WordsChecker {
    Set<String> set;
    WordsChecker(String s){
        set = new HashSet<>(Arrays.asList(s.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String wordForCheck){
        return set.contains(wordForCheck);
    }
}
