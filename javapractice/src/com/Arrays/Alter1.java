package com.Arrays;

//public class Alter1 {
//
//	public static void main(String[] args) {
//		int [] a = { 10,20,30,40,50,60};
//		
//		int n=a.length;
//		int[] b= new int[n];
//		for (int i=0;i<=n-3;i++) {
//			for(int j=i;j<=n-3;) {
//				b[i]=a[i]+a[j+1];
//				b[i+1]=a[i]+a[j+2];
//				break;
//			}
//			
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(b[i]);
//		}
//
//	}
//
//}





public class Alter1 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int n = a.length;

        int prev2 = a[0];   // a[i-2]
        int prev1 = a[1];   // a[i-1]

        // first element
        a[0] = prev2 + prev1;   // 10 + 20 = 30

        // second element
        a[1] = prev2 + a[2];    // 10 + 30 = 40

        for (int i = 2; i < n - 1; i++) {
            int curr = a[i];       // store original a[i]
            int next = a[i + 1];   // original a[i+1]

            a[i] = prev1 + next;   // correct formula

            // shift values forward (VERY IMPORTANT)
            prev2 = prev1;
            prev1 = curr;
        }

        // last element
        a[n - 1] = prev1 + a[n - 1];

        // print
        for (int x : a) {
            System.out.println(x);
        }
    }
}