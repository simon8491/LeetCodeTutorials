class LongestComPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {  //indexOf can return only -1 or 0.
                //Since flower as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flowe".
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
