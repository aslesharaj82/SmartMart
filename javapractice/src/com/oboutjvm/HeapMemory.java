package com.oboutjvm;

public class HeapMemory {

	public static void main(String[] args) {
		int mb= 1024*1024;
		Runtime r= Runtime.getRuntime();
		System.out.println("max memory:"+r.maxMemory()/mb);
		System.out.println("total memory:"+r.totalMemory()/mb);
		System.out.println("free memory:"+r.freeMemory()/mb);
	}

}
