package test2;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[] = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(nums));
		
		int tem = 0;
		
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					tem = nums[i];
					nums[i] = nums[j];
					nums[j] = tem;
				} 
			}
		}
		System.out.println("정렬후 : " + Arrays.toString(nums));

	}

}
