class ReverseWords {
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        // Split the string by spaces into newly created array of string called words
        String[] words = s.split("\\s+");
        // Reverse the order of the words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            reversedString.append(words[i]);
            //add a single space after every word until it's not the last one
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        // Return the reversed string
        return reversedString.toString();
    }
}
