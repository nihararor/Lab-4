package com.LabNo4;
import java.util.Scanner;
public class SquareandSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] arr= new int[10];
		System.out.println("Enter 10 Number here");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			sum=sum +arr[i]*arr[i];
		}
		System.out.println(sum);
	}
	
}