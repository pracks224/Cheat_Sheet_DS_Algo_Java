package Array;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class longestSubarray {
    public static void main(String[] args) {
        int[] nums = {24,12,71,33,5,87,10,11,3,58,2,97,97,36,32,35,15,80,24,45,38,9,22,21,33,68,22,85,35,83,92,38,59,
                90,42,64,61,15,4,40,50,44,54,25,34,14,33,94,66,27,78,56,3,29,3,51,19,5,93,21,58,
                91,65,87,55,70,29,81,89,67,58,29,68,84,4,51,87,74,42,85,81,55,8,95,39};
        int result = longestSubarray(nums,87);
        System.out.println(result);
    }

    public static int longestSubarray(int[] nums, int limit) {
       /* int left = 0, right = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.offer(nums[0]);
        maxHeap.offer(nums[0]);
        int maxLength = 1;

        while (right < nums.length) {
            if (Math.abs(minHeap.peek() - maxHeap.peek()) <= limit) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
                if (right < nums.length) {
                    minHeap.offer(nums[right]);
                    maxHeap.offer(nums[right]);
                }
            } else {
                minHeap.remove(nums[left]);
                maxHeap.remove(nums[left]);
                left++;
            }

            while (!minHeap.isEmpty() && !maxHeap.isEmpty() && Math.abs(minHeap.peek() - maxHeap.peek()) > limit) {
                if (nums[left] == minHeap.peek()) {
                    minHeap.poll();
                }
                if (nums[left] == maxHeap.peek()) {
                    maxHeap.poll();
                }
                left++;
            }
        }

        return maxLength;*/
        int left = 0, right = 0;
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        int maxLength = 1;

        while (right < nums.length) {
            // add the new element to the subarray
            while (!minDeque.isEmpty() && nums[right] < minDeque.peekLast()) {
                minDeque.pollLast();
            }
            while (!maxDeque.isEmpty() && nums[right] > maxDeque.peekLast()) {
                maxDeque.pollLast();
            }
            minDeque.offerLast(nums[right]);
            maxDeque.offerLast(nums[right]);

            // check if the current subarray is valid
            while (!minDeque.isEmpty() && !maxDeque.isEmpty() && Math.abs(minDeque.peekFirst() - maxDeque.peekFirst()) > limit) {
                if (nums[left] == minDeque.peekFirst()) {
                    minDeque.pollFirst();
                }
                if (nums[left] == maxDeque.peekFirst()) {
                    maxDeque.pollFirst();
                }
                left++;
            }

            // update the maximum subarray length seen so far
            maxLength = Math.max(maxLength, right - left + 1);

            // move the right pointer to the next element
            right++;
        }

        return maxLength;
    }
}
