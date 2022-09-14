package com.tcs;

public class ReverseNo {

	public static void main(String[] args) {
	int no=123456;
	int rev=0;
	
	for (;no!=0;) {
		rev=rev*10+no%10;
		no=no/10;}
	System.out.println(rev);

	}

}
