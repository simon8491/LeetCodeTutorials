import java.util.HashMap;
import java.util.Map;

class IsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)  {
            char key = s.charAt(i);
            char val = t.charAt(i);
            if (!map.containsKey(key))          // separate containsKey and containsValue to two IFs
                if (!map.containsValue(val)) {  // to be able to put the pair into the map and 
                    map.put(key, val);          // return fals ein the case of alse statement
                } else { return false; }
            else if (!map.get(key).equals(val)) {   // if the key is not equal to value after the same key is
                return false;                       // already in map, return false (g - d; g - ?)
            }
        }
        return true;
    }
}