class ReverseWordsIII {
    public String reverseWords(String s) {
        // Reverse the order of the words
        String[] words = s.split("\\s+");
        // Reverse each word in the 'words' array.
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return String.join(" ", words);
    }
}
