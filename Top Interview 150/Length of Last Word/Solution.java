class Solution {
    public int lengthOfLastWord(String s) {
        
        // Keep an index of the current character, and a size variable to count the size of the word.
        int index = s.length();
        int size = 0;

        // Iterate through the String starting at the last element, stopping when the first non-space is reached.
        while (--index != -1 && s.charAt(index) == ' ');

        // Increment the size to account for the char skipped over in the while loop.
        size++;

        // Increment the size while the index is inside the String and the current character is not a space.
        if (index != 1)
            while (--index != -1 && s.charAt(index) != ' ' && ++size != -1);

        return size;
    }
}
