package com.greatlearning.services;

public class TransactionServiceImpl {
	
	public void search(int arr[], long target) {
		System.out.println("Search to be done");
		long sum=0;
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) { 
			sum += arr[i];//1
			if (sum >= target) {//0.5
				System.out.println("Target achieved after "+(i + 1) + " transactions ");
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(" Given target is not achieved ");
		}
	}
	
	public void search2(int arr[]) {
	}
	
	public void search3(int arr[], int target) {
		long startTime = System.currentTimeMillis();
//		....
		long endTime = System.currentTimeMillis();
	}
	
	
}
