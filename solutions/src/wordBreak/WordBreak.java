package wordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        boolean[] answer = new boolean[s.length() + 1];
        answer[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (answer[j] && words.contains(s.substring(j, i))) {
                    answer[i] = true;
                    break;
                }
            }
        }
        return answer[s.length()];
    }
}
