package com.bridgelabz.fifthpackage;

public class AverageOfArrayNumbers {
	public static void main(String[] args) {
		int arr[] = { 10, 4, 3, 2, 1 };// declare array and numbers
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average of the array numbers is" + "\n" + avg);
		System.out.println("Reverse of the array numbers is" + "\n");
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("\n" + "Even numbers of the array numbers is" + "\n");
		for (int k = 0; k < arr.length; k++) {

			if (arr[k] % 2 == 0) {
				System.out.print(" " + arr[k]);
			}

			else {
			}
		}
		{

		}
	}
}
