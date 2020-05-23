class Solution {
    
    private int[] array;
    private int[] original;
    
    private Random random = new Random();

    public Solution(int[] nums) {
        array = nums;
        original = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }
    
    public void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    
    public int index(int min, int max) {
        return random.nextInt(max - min) + min;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        
        for(int i = 0; i < array.length; i++) {
            
            swap(i, index(i,array.length));
        }
        return array;
    }
}

