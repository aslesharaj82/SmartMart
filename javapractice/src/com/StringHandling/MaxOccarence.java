package com.StringHandling;

//public class MaxOccarence {
//
//	public static void main(String[] args) {
//
//		String s = "abbccc";
//		int[] a = new int[127];
//		for (int i = 0; i < s.length(); i++) {
//
//			a[s.charAt(i)]++;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//		if(a[i]>0) {
//			System.out.print((char)i+""+ a[i]);
//		}
//		}
//		
//		
//		
//		int max = -1;
//
//		char MaxOccured = ' ';
//		for (int i = 0; i < s.length(); i++) {
//
//			if (a[s.charAt(i)] > max) {
//				max = a[s.charAt(i)];
//				MaxOccured = s.charAt(i);
//			}
//		}
////		System.out.println(MaxOccured);
////		System.out.println(max);
//	}
//
//}




public class MaxOccarence {

    public static void main(String[] args) {

        String s = "abbccc";
        int[] freq = new int[127];
        boolean[] visited = new boolean[127];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Print in same order as string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!visited[ch]) {
                System.out.print(ch + "" + freq[ch]);
                visited[ch] = true;
            }
        }
    }
}
