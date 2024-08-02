import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> anagrams = new HashMap<>();  //hash map for grouping the anagrams where the key will be the
                                                                    //sorted string of chars and the value will be the word
        List<List<String>> outList = new ArrayList<>(); //output list of grouped anagrams

        for (String word : strs) {                  //iterate through the strs array
            char[] chars = word.toCharArray();      //convert strings from strs array to cahrs to be able to sort
            Arrays.sort(chars);
            String key = new String(chars);         //sorted chars as a key for hash map

            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(word);
            if (!outList.contains(anagrams.get(key))) {
                outList.add(anagrams.get(key));
            }
        }
        return outList;
    }
}