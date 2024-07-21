import java.util.HashMap;
import java.util.Map;

class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> chars = new HashMap<>();    //keys are char, values are int
        for (int i = 0; i < s.length(); i++) {  //create a map from string
            if (chars.containsKey(s.charAt(i))) {   //s.charAt(i) -> char in the string at index i
                chars.put(s.charAt(i), chars.get(s.charAt(i))+1);   //put key -> char of the string, and value -> get the value assigned to the key
                                                                    //chosen from string by index i and increase this value by 1 to count the number of
                                                                    //occurencies of that char in the string
                                                                    //e.g.: o occures 2x, e occures 4x ...
            } else {
                chars.put(s.charAt(i), 1);  //put the key -> char of the string, and the value 1 -> each non repeated char will have a value 1
            }
        }
        for (int i = 0; i < s.length(); i++) {  //iterate thru the string again (not thru the map) and 
            if (chars.get(s.charAt(i)) == 1) {  //find the first non repeated char(key) in the map
                                                //e.g.: key "l" has a value 1 in the map, and index 0 in the string, so return 0
                return i;
            }
        }
        return -1;
    }
}