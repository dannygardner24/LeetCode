class Solution {
    public boolean canJump(int[] nums) {

        // Keeps track of the farthest index that can be reached after parsing through the
        // array.
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the furthest we can go based on the
            // previous elements of the array, we know the game is impossible, so return
            // false.
            if (i > maxIndex) {
                return false;
            } else {
                // If we can go further in the array at the current index, then we update
                // the new maximum index.
                maxIndex = Math.max(maxIndex, i + nums[i]);
            }
        }
        // Since we made it to the end index of the array, we know the game is possible,
        // so return true.
        return true;
    }
}
