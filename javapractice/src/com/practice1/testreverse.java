package com.practice1;

public class testreverse {

	public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int s = arr.length;
        int temp;

        for(int i = 0, j = s - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // array is updated
        for(int n : arr) {
            System.out.print(n + " ");
        }

	}

}
