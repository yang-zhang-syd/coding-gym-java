package com.example;

public class KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {
        int inverse = nums.length - k;
        return findKthLargest(0, nums.length - 1, nums, inverse);
    }

    private int findKthLargest(int begin, int end, int[] nums, int k) {

        int currentIdx = begin;

        for(int i = begin + 1; i <= end; ++i) {
            if(nums[i] >= nums[currentIdx]) {
                int tmp = nums[currentIdx + 1];
                nums[currentIdx + 1] = nums[currentIdx];
                nums[currentIdx] = nums[i];
                nums[i] = tmp;
                currentIdx = currentIdx + 1;
            }
        }

        if(currentIdx == k - 1)
            return nums[currentIdx];

        else if(currentIdx > k - 1)
            return findKthLargest(begin, currentIdx - 1, nums, k);

        else
            return findKthLargest(currentIdx + 1, end, nums, k - currentIdx);
    }

}
