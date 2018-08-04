package com.java.assignment;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}

}
