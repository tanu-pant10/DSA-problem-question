class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sub = new ArrayList<>();
        backtrack(0, sub, new ArrayList<>(), nums);
        return sub; 
    }

    public void backtrack(int start, List<List<Integer>> sub, List<Integer> temp, int[] nums) {
        sub.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, sub, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}