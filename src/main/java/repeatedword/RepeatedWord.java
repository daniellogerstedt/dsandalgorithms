package repeatedword;

//String splitting found here: https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space

import hashtable.HashTable;

public class RepeatedWord {

    public static String[] words;
    public static HashTable<Boolean> wordTrack;

    public static String firstRepeated (String wordCol) {
        words = wordCol.split("\\s+");
        wordTrack = new HashTable<>();
        for (String word : words) {
            if (wordTrack.contains(word.toLowerCase())) return word.toLowerCase();
            wordTrack.add(word.toLowerCase(), true);
        }
        return null;
    }

}
