class Solution {
    public int lengthOfLastWord(String s) {
        
        //Keep an index of the current character, and a size variable to count the size of the word.
        int index = s.length();
        int size = 0;

        while (--index != -1 && s.charAt(index) == ' ');

        size++;

        if (index != 1)
            while (--index != -1 && s.charAt(index) != ' ' && ++size != -1);

        return size;
    }
}
