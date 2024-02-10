package test2;

import java.util.Arrays;

public class SelectionSortTest2 {
	
	public static void recursiveStructure(int nums[], int start) {
		if(start < nums.length-1) {
			int temp = 0;
			int min_index = start;
			for (int i = start; i < nums.length; i++) {
				if(nums[i] < nums[min_index]) {
					min_index = i;
				}
			}
			
			temp = nums[start];
			nums[start] = nums[min_index];
			nums[min_index] = temp;
			
			recursiveStructure(nums, start + 1);
		}
	}
	
	static int nums[] = new int[10];
	
	public static void main(String[] args) {
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(nums));
		recursiveStructure(nums, 0);
		System.out.println("정렬 후 : " + Arrays.toString(nums));

	}

}
