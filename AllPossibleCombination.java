package com.LabNo4;
import java.util.Scanner;

public class AllPossibleCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        System.out.println("Enter the 3 number Of Your Choice");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d[] = { a, b, c };
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 3; k++) {
	                    if (i != j && j != k && k != i) {
	                        System.out.println(d[i] +" " + d[j] + " " + d[k]);
	                    }
	                }
	            }
	        }

	}

}
